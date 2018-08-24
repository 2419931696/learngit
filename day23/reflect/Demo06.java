package reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) 
		throws Exception{
		/**
		 * 运行期间利用反射API查找标注在方法上的注解
		 * 1. 动态加载类
		 * 2. 动态找到全部方法
		 * 3. 查找方法上标注的注解
		 */
		Scanner in = new Scanner(System.in);
		System.out.print("输入类名：");
		String className = in.nextLine();
		//动态加载类
		Class cls = Class.forName(className);
		//动态查找全部方法
		Method[] methods = cls.getDeclaredMethods();
		for (Method method : methods) {
			//method 代表 cls 类上每一个方法
			System.out.println(method); 
			// Annotation 注解，getAnnotations()
			// 用于获取标注在方法上的注解。
			Annotation[] annotations=
					method.getAnnotations();
			for (Annotation ann : annotations) {
				System.out.println(ann); 
			}
		}
	}

}







