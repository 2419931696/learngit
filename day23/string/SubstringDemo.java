package string;
/**
 * String substring(int start,int end)
 * 截取当前字符串中指定范围内的字符串，在API中有一个
 * 特点，凡是使用两个数字表示范围时，通常都是"含头不含尾"
 * 的。
 * @author adminitartor
 *
 */
public class SubstringDemo {
	public static void main(String[] args) {
		//            0123456789012
		String str = "www.baidu.com";
		
		//截取域名
		String sub = str.substring(4,9);
		System.out.println(sub);
		
		//一个参数的则是从指定位置截取到末尾
		sub = str.substring(4);
		System.out.println(sub);
	}
}











