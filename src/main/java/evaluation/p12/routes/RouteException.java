package evaluation.p12.routes;

public class RouteException extends Exception {
	private String message;

	public RouteException(String message) {
		super();
		this.message = message;
	}

	public RouteException() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
