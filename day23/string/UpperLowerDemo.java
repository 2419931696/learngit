package string;
/**
 * 字符串提供了可以将当前字符串中的英文部分转换为全
 * 大写或全小写
 * String toUpperCase()
 * String toLowerCase()
 * 
 * @author adminitartor
 *
 */
public class UpperLowerDemo {
	public static void main(String[] args) {
		String string = "我爱Java";
		
		String upper = string.toUpperCase();
		System.out.println("upper:"+upper);
		
		String lower = string.toLowerCase();
		System.out.println("lower:"+lower);
		
	}
}












