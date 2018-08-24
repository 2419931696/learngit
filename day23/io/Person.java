package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用该类测试对象流的读写操作
 * 
 * 当一个类希望被对象流进行读写，那么该类必须实现接口:
 * java.io.Serializable
 * 该接口没有任何抽象方法，这种接口称为:签名接口。
 * 虽然在源码中不需要重写方法，但实际上编译器在编译该类
 * 为class文件时会根据当前类结构添加一个方法，用于将当前
 * 类实例转换为一组字节。
 * 
 * 
 * @author adminitartor
 *
 */
public class Person implements Serializable{
	/**
	 * 当一个类实现了Serializable接口后，编译器会提示
	 * 我们应当添加一个常量:serialVersionUID
	 * 序列化版本号影响着反序列化的结果。当对象输入流在
	 * 反序列化一个实例时会检查该实例与其所属的类的版本
	 * 号是否一致，不一致则反序列化会抛出版本号不一致的
	 * 异常。若一致则成功进行反序列化。
	 * 自行维护版本号可以主动确定反序列化结果。但是若不
	 * 指定序列化版本号，编译器在编译当前类时会根据当前
	 * 类的结构生成一个版本号，但是只要当前类发生改变，
	 * 则版本号一定会改变。
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	/*
	 * transient关键字
	 * 当一个属性被该关键字修饰后，那么当该类的某个实例
	 * 被序列化时，这个值会被忽略。那么在对象反序列化时
	 * 也不会得到该值。
	 * 忽略某些不重要的属性可以达到对象"瘦身"的操作，减少
	 * 资源消耗。
	 */
	private transient String[] otherInfo;
	public Person(String name, int age, String gender, String[] otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	public String toString() {
		return name+","+age+","+gender+","+
	           Arrays.toString(otherInfo);
	}
	
	
	
}









