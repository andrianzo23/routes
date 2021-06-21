package evaluation.p12.routes.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
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
import evaluation.p12.routes.models.Portion;
import evaluation.p12.routes.models.Rf;
import evaluation.p12.routes.models.Route;
import evaluation.p12.routes.models.RouteFin;
import evaluation.p12.routes.models.RouteVille;
import evaluation.p12.routes.models.Rv;
import evaluation.p12.routes.models.UpdateRF;
import evaluation.p12.routes.models.UpdateRV;
import evaluation.p12.routes.models.Ville;

@Controller
public class RouteController {
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


	@RequestMapping(value = "/add-route", method = RequestMethod.GET)
	public String showAddTodoPage(ModelMap model) {
		model.addAttribute("route",new Route());
		return "RouteInsert";
	}
	
	@RequestMapping(value = "/add-route", method = RequestMethod.POST)
	public String addTodo(@ModelAttribute("route") Route route) {
		routeS.getRouteR().save(route);
		return "redirect:/add-route";
	}
	
	@RequestMapping(value = "/add-portion", method = RequestMethod.GET)
	public String showAddPortionPage(ModelMap model) {
		model.addAttribute("portion",new Portion());
		model.addAttribute("routes",routeS.getRouteR().findAll());
		return "PortionInsert";
	}
	
	@RequestMapping(value = "/add-portion", method = RequestMethod.POST)
	public String addPortion(@ModelAttribute("portion") Portion portion) {
		routeS.getPortionR().save(portion);
		return "redirect:/add-portion";
	}

	@RequestMapping(value = "/list-route", method = RequestMethod.GET)
	public String showListVillePage(ModelMap model) {
		model.addAttribute("routes",routeS.getPointRouteR().findAll());
		model.addAttribute("routeS", routeS);
		return "listRoute";
	}

	@RequestMapping(value = "/delete-route", method = RequestMethod.GET)
	public String deleteVille(@RequestParam int id) {
		routeS.getRouteR().deleteById(id);
		// service.deleteTodo(id);
		return "redirect:/list-route";
	}
	
	@RequestMapping(value = "/update-route", method = RequestMethod.GET)
	public String showUpdateRoutePage(@RequestParam int id, ModelMap model) {
		UpdateRF RF = new UpdateRF();
		RF.setRoute(routeS.getRouteR().findById(id).get());
		model.addAttribute("RF",RF);
		model.addAttribute("villes", villeS.getVilleR().findAll());
		return "updateRoute";
	}

	@RequestMapping(value = "/update-route", method = RequestMethod.POST)
	public String updateRoute(@ModelAttribute("RF") UpdateRF rf, BindingResult result) {

		if (result.hasErrors()) {
			return "ville";
		}
		System.out.println("idRoute = " + rf.getRoute().getIdRoute());
		routeS.getRouteFR().save(rf.getRF());
		routeS.getRouteR().save(rf.getRoute());
		

		return "redirect:/list-route";
	}
	
	@RequestMapping(value = "/details-route", method = RequestMethod.GET)
	public String showDetailsRoutePage(@RequestParam int id,ModelMap model) {
		try {
			model.addAttribute("pointRoute",routeS.getPointRouteR().findByIdRoute(id));
			System.out.println(routeS.getPointRouteR().findAll().size());
			int etat = routeS.getEtatMoyenne(routeS.getPortionR().findByIdRoute(id));
			int distance = routeS.getDistanceByIdRoute(id);
			
			model.addAttribute("etat", etat);
			model.addAttribute("commentaire", routeS.getCommentaireEtat(etat));
			model.addAttribute("routeS", routeS);
			model.addAttribute("cout", new Double(routeS.getCoutEntretien(routeS.getPortionR().findByIdRoute(id))).longValue());
			model.addAttribute("temps",routeS.getTempsEntretien(etat,distance));
			
			model.addAttribute("portions", routeS.getPortionR().findByIdRoute(id));
		}
		catch(Exception e) {
			model.addAttribute("portions", routeS.getPortionR().findByIdRoute(id));
		}
		finally{
			return "detailsRoute";
		}
			
	}


}
