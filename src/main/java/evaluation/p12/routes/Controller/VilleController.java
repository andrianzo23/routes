package evaluation.p12.routes.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import evaluation.p12.routes.Services.RouteService;
import evaluation.p12.routes.Services.RouteVilleService;
import evaluation.p12.routes.Services.VilleService;
import evaluation.p12.routes.models.RouteVille;
import evaluation.p12.routes.models.Rv;
import evaluation.p12.routes.models.UpdateRV;
import evaluation.p12.routes.models.Ville;


@Controller
public class VilleController {
	@Autowired
	private RouteService routeS;
	@Autowired
	private RouteVilleService routeVilleS;
	@Autowired
	private VilleService villeS;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// Date - dd/MM/yyyy
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}


	@RequestMapping(value = "/add-ville", method = RequestMethod.GET)
	public String showAddTodoPage(ModelMap model) {
		model.addAttribute("ville",new Ville());
		model.addAttribute("routes",routeS.getRouteR().findAll());
		return "VilleInsert";
	}
	
	@RequestMapping(value = "/add-ville", method = RequestMethod.POST)
	public String addTodo(@ModelAttribute("ville") Ville ville) {
		villeS.getVilleR().save(ville);
		return "redirect:/add-ville";
	}

	@RequestMapping(value = "/list-ville", method = RequestMethod.GET)
	public String showListVillePage(ModelMap model) {
		model.addAttribute("villes",villeS.getVilleR().findAll());
		return "listVille";
	}

	@RequestMapping(value = "/delete-ville", method = RequestMethod.GET)
	public String deleteVille(@RequestParam int id) {
		villeS.getVilleR().deleteById(id);
		// service.deleteTodo(id);
		return "redirect:/list-ville";
	}

	@RequestMapping(value = "/update-ville", method = RequestMethod.GET)
	public String showUpdateVillePage(@RequestParam int id, ModelMap model) {
		UpdateRV RVs = new UpdateRV();
		RVs.setId(id);
		RVs.addRV(new Rv());
		RVs.addRV(new Rv());
		
		RVs.getRVs().get(0).getRV().setIdVille(id);
		RVs.getRVs().get(1).getRV().setIdVille(id);

		System.out.println("idVille = " + RVs.getRVs().get(0).getRV().getIdVille());
		model.put("rvs", RVs );
		model.put("routes", routeS.getRouteR().findAll());
		return "updateVille";
	}

	@RequestMapping(value = "/update-ville", method = RequestMethod.POST)
	public String updateVille(@ModelAttribute("rvs") UpdateRV rvs, BindingResult result) {

		if (result.hasErrors()) {
			return "ville";
		}
		
		Ville valVille = new Ville(rvs.getId(),rvs.getNomVille());
		villeS.getVilleR().save(valVille);
		RouteVille val = new RouteVille();
		for(int i = 0;i<rvs.getRVs().size();i++) {
			if(rvs.getRVs().get(i).getValide() == 1) {
				val = rvs.getRVs().get(i).getRV();
				val.setIdVille(rvs.getId());
				routeVilleS.getRouteVilleR().save(val);
				System.out.println("idVille = " + val.getIdVille());
				val = new RouteVille();
			}
		}

		return "redirect:/list-ville";
	}
}
