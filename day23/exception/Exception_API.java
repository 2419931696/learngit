package exception;
/**
 * 异常常见的方法
 * @author adminitartor
 *
 */
public class Exception_API {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String string = "a";
			int a = Integer.parseInt(string);
		} catch (Exception e) {
			System.out.println("出错了！");
			//输出错误信息，有助于找到并解决错误
//			e.printStackTrace();
			
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("程序结束了");
	}
}




