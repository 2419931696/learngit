package exception;

import java.awt.event.MouseWheelEvent;

/**
 * 使用当前类测试异常的抛出
 * @author adminitartor
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}
	/**
	 * 当一个方法使用throws声明一个异常的抛出时，那么
	 * 调用者在调用该方法时就必须处理这个异常
	 */
	public void setAge(int age)throws IllegalAgeException {
		if(age<0||age>100){
			/*
			 * 一个方法当中使用throw抛出什么异常，就要
			 * 在方法上使用throws声明该异常的抛出，只有
			 * RuntimeException无需这样，其它类型异常
			 * 则是必须的，否则编译不通过
			 */
			throw new IllegalAgeException("年龄不合法");
		}
		this.age = age;
	}
	
	
}









