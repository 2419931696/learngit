package string;
/**
 * 字符串支持正则表达式方法二:
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分，并返回
 * 拆分后的内容
 * @author adminitartor
 *
 */
public class SplitDemo {
	public static void main(String[] args) {
		String line = "abc123def456ghi789jkl";
		/*
		 * 按照数字部分拆分
		 * 在拆分过程中若连续匹配了两个可以拆分内容，那么
		 * 中间就会拆分出一个空字符串。但是若在字符串末尾
		 * 连续匹配，那么所有拆分出来的空字符串都会忽略。
		 */
		String[] arr = line.split("[0-9]+");
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}









