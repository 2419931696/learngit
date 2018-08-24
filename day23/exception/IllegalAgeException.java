package exception;
/**
 * 年龄不合法异常
 * 
 * 自定义异常，通常用来说明我们程序中的某个业务逻辑错误
 * 因为java提供的异常基本上没有描述实际项目中的业务错误
 * 这时我们可以自行定义一个异常。
 * @author adminitartor
 *
 */
public class IllegalAgeException extends Exception{
	private static final long serialVersionUID = 1L;

	public IllegalAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	
	
}















