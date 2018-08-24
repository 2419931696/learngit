package lambda;
/**
 * lambda表达式
 * JDK1.8之后推出的一个新特性，可以更简洁的创建匿名内部类
 * 使用lambda创建匿名内部类时要求该接口必须有而且只能有
 * 一个抽象方法时才可以使用。
 * 
 * lambda语法:
 * (参数列表)->{
 *   方法体
 * }
 * 使用lambda无需指定实现的接口，以及重写方法，编译器会
 * 结合当前源码分析并自动判别。注意，lambda也是编译器认可
 * 最终会被编译器改为传统方式创建。
 * @author adminitartor
 *
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		//匿名内部类形式创建
		Runnable r1 = new Runnable(){
			public void run(){
				System.out.println("hello");
			}
		};
		//lambda形式创建
		Runnable r2 = ()->{
			System.out.println("hello");
		};
		
		/*
		 * 如果方法中只有一句代码，那么该方法的"{}"可以
		 * 省略
		 */
		Runnable r3 = ()->System.out.println("hello");
		
	}
}


















