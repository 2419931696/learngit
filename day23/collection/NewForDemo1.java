package collection;
/**
 * JDK1.5之后推出了一个特性:增强型for循环
 * 也成为新循环或for each
 * 
 * 新循环是用来遍历集合或数组使用的，所以功能上不取代
 * 传统for循环的工作，并且该特性是编译器认可，而非虚拟机
 * 认可。编译器最终会将使用新循环遍历改为传统遍历方式。
 * @author adminitartor
 *
 */
public class NewForDemo1 {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four"};
		for(int i=0;i<array.length;i++){
			String str = array[i];
			System.out.println(str);
		}
		/*
		 * 最终编译器会将代码改编为普通for循环遍历方式
		 */
		for(String str : array){
			System.out.println(str);		
		}
		
	}
}











