package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo01 {

	public static void main(String[] args) {
		/**
		 * 利用反射API检查对象的内部结构 
		 */
		test("abc"); 
		test(123); 
		test(new ArrayList<>()); 
		Collection<String> c = new LinkedList<>();
		Iterator<String> ite = c.iterator();
		//ite 的具体对象的类型是什么？
		test(ite);
	}
	
	public static void test(Object obj){
		//obj 的具体类型是什么？
		//如何在方法中检查对象的具体类型？
		//利用反射API可以“动态”检查对象的类型
		//Object类上定义了getClass，用于检查
		//软件执行期间对象的具体类型！
		Class cls = obj.getClass();
		System.out.println(cls); 
		
		//进一步动态检查类型的内部结构：
		//1. 检查类型声明的全部成员变量
		// Declared 声明的 Field：字段，成员变量
		// getDeclaredFields方法的功能是检查cls
		// 代表的类型中全部的字段（成员变量）
		Field[] fields=cls.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field); 
		}
		
		//2. 检查类中声明的方法(Method)
		// getDeclaredMethods 动态获取当前类型中声明的
		// 方法信息，不包含继承的方法
		// getMethods() 获取当前类和从父类中继承的方法
		Method[] methods=cls.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		 
		//3. 检查类中声明的构造方法（Constructor）
		//自行编写案例代码。。。
	}
}









