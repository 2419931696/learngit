package doc;
/**
 * 文档注释，用来在类，方法，常量上使用。是功能级注释。
 * 说明设计类的意图，方法的功能等。
 * 
 * @author adminitartor
 * @version 1.0
 * @see java.lang.String
 * @since JDK 1.0
 *
 */
public class APIDocDemo {
	/**
	 * sayHello方法中使用的问候语
	 */
	public static final String INFO = "你好!";
	
	/**
	 * 对给定的用户添加一个问候语
	 * @param name  指定用户的名字
	 * @return 含有问候语的字符串
	 */
	public String sayHello(String name){
		return INFO + name;
	}
}













