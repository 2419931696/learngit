package reflect;

import java.lang.reflect.Method;

public class JUnit {

	public static void main(String[] args) 
		throws Exception{
		/**
		 * 注解的用途演示：
		 * 
		 * 实现一个工具，自动执行类中标注了@Test的方法 
		 */
		String className="reflect.DemoAll";
		Class cls = Class.forName(className);
		Object obj=cls.newInstance(); 
		Method[] methods = cls.getDeclaredMethods();
		for (Method method : methods) {
			//检查每个方法上是否包含 @Test 注解
			//getAnnotation(Test.class) 检查方法上
			//是否包含 Test.class 注解，如果包含
			//则返回注解类型的对象，如果不包含返回null
			Test ann = 
				method.getAnnotation(Test.class);
			if (ann != null) {
				//找到注解
				method.invoke(obj);
			}
		}
	}
}








