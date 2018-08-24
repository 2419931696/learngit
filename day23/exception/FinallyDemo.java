package exception;
/**
 * finally块
 * finally块是定义在异常处理机制的最后一块。它可以直接
 * 跟在try之后或者最后一个catch之后。
 * finally可以保证只要程序执行到了try块当中，那么无论
 * try块中的语句是否会抛出异常， finally都确保其内容一定
 * 被执行。通常会将释放资源等操作放在finally中，如流的
 * 关闭操作。
 *
 * @author adminitartor
 *
 */
public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String string = "";
			System.out.println(string.length());
			return;
		} catch (Exception e) {
			System.out.println("出错了!");
		} finally{
			System.out.println("finally块中的代码执行了!");
		} 
	
		System.out.println("程序结束了");
	}
}








