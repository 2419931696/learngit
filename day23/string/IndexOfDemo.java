package string;
/**
 * int indexOf(String str)
 * 查找给定字符串在当前字符串中的位置。若当前字符串不包含
 * 给定内容，则返回值为-1.
 * @author adminitartor
 *
 */
public class IndexOfDemo {
	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java";
		
		int index = str.indexOf("in");
		System.out.println("index:"+index);
		/*
		 * 重载方法允许从指定位置开始查找第一次出现的位置
		 */
		index = str.indexOf("in", 3);
		System.out.println("index:"+index);
		/*
		 * 查找给定字符串在当前字符串中最后一次出现的位置
		 */
		index = str.lastIndexOf("in");
		System.out.println("index:"+index);
		
	
	}
}











