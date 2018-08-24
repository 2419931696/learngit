package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) 
		throws Exception{
		/**
		 * 利用反射执行一个类中全部以test为开头的方法
		 */
		// 1. 动态获取类名
		Scanner in = new Scanner(System.in);
		System.out.print("输入类名：");
		String className = in.nextLine();
		// 2. 根据类名动态加载类到方法区
		Class cls = Class.forName(className);
		System.out.println(cls); 
		// 3. 动态创建对象
		Object obj = cls.newInstance();
		System.out.println(obj); 
		// 4. 动态查找全部方法
		Method[] methods=cls.getDeclaredMethods();
		// 5. 遍历全部方法，找到以test为开头的方法
		for(Method method:methods){
			//获取方法的名称 method.getName();
			String name=method.getName();
			System.out.println(name); 
			//6. 检查方法名是否以test为开头
			if(name.startsWith("test")){
				// 7. 执行找到的方法
				method.invoke(obj);
			}
		}
	}
}
















