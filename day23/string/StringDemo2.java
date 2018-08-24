package string;
/**
 * 字符串拼接带来的性能问题
 * @author adminitartor
 *
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String string = "a";
		for(int i=0;i<10000000;i++){
			string += string;
		}
		System.out.println("执行完毕!");
	}
}









