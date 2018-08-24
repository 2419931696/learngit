package exception;
/**
 * 异常处理机制中的try-catch
 * 语法定义:
 * try{
 * 	可能出现异常的代码片段
 * }catch(XXXException e){
 *  捕获try中出现的XXXException后的处理操作代码
 * }
 * @author adminitartor
 *
 */
public class Try_CatchDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		
		try{
			String string  = "a";
			System.out.println(string.length());
			
			System.out.println(string.charAt(0));
			
			System.out.println(Integer.parseInt(string));
			/*
			 * 在try块中出错语句以下的代码都不会被执行
			 */
			System.out.println("!!!!!!");
		}catch(NullPointerException e){
			System.out.println("出现了空指针!");
		
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("字符串下标越界了！");
		/*
		 * 应当有一个好习惯，在最后一个catch处捕获Exception
		 * 防止一个未捕获的异常导致程序中断。
		 */
		}catch(Exception e){
			System.out.println("反正就是出了个错!");
		}
		
		System.out.println("程序结束了");
	}
}










