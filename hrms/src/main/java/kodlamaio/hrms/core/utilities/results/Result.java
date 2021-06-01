package kodlamaio.hrms.core.utilities.results;

public class Result {
 	private String message;
	private Boolean success;
	
	public Result(boolean success) {
		this.success = success;
	}
	public Result(boolean success,String message) {
		this(success);
		this.message = message;
	}
	public Boolean isSuccess() {
		return this.success;
	}
	public String getMessage() {
		return this.message;
	}
}
