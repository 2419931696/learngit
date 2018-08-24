package integer;
/**
 * 包装类都提供了一个静态方法:parseXXX(String line)
 * 这个方法可以将给定的字符串转换为对应的基本类型，前提
 * 是该字符串必须正确描述该基本类型可以保存的值。
 * @author adminitartor
 *
 */
public class ParseDemo {
	public static void main(String[] args) {
		String string = "123";
		
		int a = Integer.parseInt(string);
		System.out.println(a);//123
		
		double d = Double.parseDouble(string);
		System.out.println(d);//123.0
	}
}










