package string;
/**
 * 字符串提供了一组静态的方法:valueOf
 * 可以将其他类型转换为字符串。常用的是将基本类型转换
 * 为字符串。
 * @author adminitartor
 *
 */
public class ValueOfDemo {
	public static void main(String[] args) {
		int i = 123;
		String iString = String.valueOf(i);
		System.out.println(iString);
		
		iString = i+"";//任何内容与字符串连接结果还是字符串
		
		
		double d = 123.123;
		String dString = String.valueOf(d);
		System.out.println(dString);
		
		
	}
}










