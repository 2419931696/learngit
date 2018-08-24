package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args)
		throws Exception{
		/**
		 * 动态加载类，并且动态创建对象
		 * 如下代码可以动态加载任何的类，创建其对象
		 * 注意：类型必须有无参数构造器
		 */
		Scanner in = new Scanner(System.in);
		//运行期间通过控制台读取类名
		System.out.print("输入类名：");
		String className=in.nextLine();
		//动态加载类到方法区，类名错误时候抛异常
		Class cls = Class.forName(className);
		//显示加载的结果
		System.out.println(cls);
		//动态创建对象，如果没有无参数构造器时抛异常
		Object obj = cls.newInstance(); //Foo
		//显示创建好的对象 
		System.out.println(obj); 
		
		//动态输入方法名
		System.out.print("输入方法名：");
		String methodName = in.nextLine(); //test
		//根据方法名动态查找方法method
		//getDeclaredMethod 根据给定的方法名查找
		//一个方法，返回值是一个方法。如果没有找到抛异常
		Method method=
				cls.getDeclaredMethod(methodName);
		//开启方法的访问权限,用来访问不可见方法
		method.setAccessible(true);
		//动态执行方法, obj 对象上一定要包含指定的方法！
		Object val= method.invoke(obj);
		//val 是方法的返回值，如果没有返回值则为null
		System.out.println(val); 
		
	}

}






