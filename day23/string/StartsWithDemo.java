package string;
/**
 * String startsWith(String str)
 * 判断当前字符串是否是以给定的字符串开始的
 * 
 * String endsWith(String str)
 * 判断当前字符串是否是以给定的字符串结尾的
 * 
 * @author adminitartor
 *
 */
public class StartsWithDemo {
	public static void main(String[] args) {
		String line = "thinking in java";
		
		boolean starts = line.startsWith("think");
		System.out.println("starts:"+starts);
		
		boolean ends = line.endsWith("ava");
		System.out.println("ends:"+ends);
	}
}










