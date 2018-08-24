package exception;
/**
 * 测试异常的抛出
 * @author adminitartor
 *
 */
public class ThrowDemo {
	public static void main(String[] args) {
		Person person = new Person();
		/*
		 * 通常一个方法抛出异常由两种情况
		 * 1:方法当中遇到了满足语法要求，但是不满足业务
		 *   逻辑要求(下面的案例就是这种情况)
		 * 2:方法中确实出现了异常，但是该异常不应当由该
		 *   方法处理时，会抛出给调用者解决
		 */
		try {
			/*
			 * 当调用一个含有throws声明异常抛出的方法时
			 * 编译器提示必须处理该异常，处理的手段有两
			 * 种:
			 * 1:使用try-catch捕获并处理该异常
			 * 2:继续在当前方法上使用throws声明该异常抛出
			 */
			person.setAge(1000);
		} catch (IllegalAgeException e) {
			System.out.println("出错了!");
		}
		System.out.println(person.getAge());
	}
}







