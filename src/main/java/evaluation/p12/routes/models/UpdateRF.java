package evaluation.p12.routes.models;


public class UpdateRF {
		private Route route;
		private RouteFin RF;
		public UpdateRF(Route route, RouteFin rF) {
			super();
			this.route = route;
			RF = rF;
		}
		public UpdateRF() {
			super();
		}
		public Route getRoute() {
			return route;
		}
		public void setRoute(Route route) {
			this.route = route;
		}
		public RouteFin getRF() {
			return RF;
		}
		public void setRF(RouteFin rF) {
			RF = rF;
		}		
		
		
}
