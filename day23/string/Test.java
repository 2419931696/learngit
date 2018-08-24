package string;
/**
 * 截取域名
 * @author adminitartor
 *
 */
public class Test {
	public static void main(String[] args) {
		String s1 = "www.baidu.com";
		System.out.println(getHostName(s1));//baidu
		String s2 = "www.tedu.cn";
		System.out.println(getHostName(s2));//tedu
		String s3 = "http://www.sina.com.cn";
		System.out.println(getHostName(s3));//sina		
	}
	
	public static String getHostName(String line){
		/*
		 * 思路:截取两个点之间的字符串
		 */
		int start = line.indexOf(".")+1;
		int end = line.indexOf(".",start);		
		return line.substring(start,end);
	}
}





