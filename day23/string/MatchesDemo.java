package string;
/**
 * 字符串支持正则表达式方法一:
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串是否满足格式要求。
 * 需要注意，这里正则表达式无论是否加了边界匹配符(^...$)
 * 都是做全匹配验证
 * @author adminitartor
 *
 */
public class MatchesDemo {
	public static void main(String[] args) {
		String mail = "fancq@tedu.cn";
		/*
		 * 邮箱的正则表达式:
		 * \w+@\w+(\.[a-zA-Z]+)+
		 * 
		 */
		String regex = "\\w+@\\w+(\\.[a-zA-Z]+)+";
		
		boolean check = mail.matches(regex);
		if(check){
			System.out.println("是邮箱");
		}else{
			System.out.println("不是邮箱");
		}
		
	}
}











