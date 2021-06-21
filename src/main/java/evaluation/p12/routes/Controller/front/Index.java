package evaluation.p12.routes.Controller.front;

import java.util.List;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import evaluation.p12.routes.Services.RouteService;
import evaluation.p12.routes.Services.RouteVilleService;
import evaluation.p12.routes.Services.VilleService;
import evaluation.p12.routes.models.PRVilles;
import evaluation.p12.routes.models.PointRoute;
import evaluation.p12.routes.models.Route;
import evaluation.p12.routes.models.RouteVille;

@Controller
public class Index {
	@Autowired
	private RouteService routeS;
	@Autowired
	private RouteVilleService routeVilleS;
	@Autowired
	private VilleService villeS;	

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String showAddIndexPage(ModelMap model) {
		return "front/index";
	}

		@RequestMapping(value = "/about", method = RequestMethod.GET)
		public String showAboutPage(ModelMap model) {
			return "front/about";
		}

		@RequestMapping(value = "/service", method = RequestMethod.GET)
		public String showServicePage(ModelMap model) {

			return "front/service";
		}

		@RequestMapping(value = "/blog", method = RequestMethod.GET)
		public String showBlogPage(ModelMap model) {
			return "front/blog";
		}
		
		@RequestMapping(value = "/contact", method = RequestMethod.GET)
		public String showContactPage(ModelMap model) {
			return "front/contact";
		}
		
		@RequestMapping(value = "/team", method = RequestMethod.GET)
		public String showTeamPage(ModelMap model) {
			Vector<PRVilles> v = new Vector<PRVilles>(1,1);
			List<PointRoute> prs = routeS.getPointRouteR().findAll();
			PRVilles ex = new PRVilles();
			for(int i= 0;i<prs.size();i++) {
				System.out.println("i = " + i);
				List<RouteVille> vs = routeVilleS.getRouteVilleR().findByIdRoute(prs.get(i).getId_Route());
				ex.setVilles(villeS.getVillesOfRV(vs));
				ex.setpRoute(prs.get(i));
				v.add(ex);
				System.out.println("i = " + vs.get(0).getIdVille());
				ex = new PRVilles();
			}
			List<PRVilles> routes = v.subList(0,v.size());
			model.addAttribute("routes",routes);
			model.addAttribute("routeS", routeS);
			return "front/team";
		}
		
		@RequestMapping(value = "/front-details-route", method = RequestMethod.GET)
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
				return "front/details-team";
			}
				
		}

}
