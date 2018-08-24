package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入类名");
		String line=sc.nextLine();
		Class cls=Class.forName(line);
		Object obj=cls.newInstance();
		System.out.println("请输入方法名");
		String methodname=sc.nextLine();
		Method method=cls.getDeclaredMethod(methodname,int.class,String.class);//加载出方法
		System.out.println(method);
		System.out.println("输入参数1");
		String s1=sc.nextLine();
		System.out.println("输入参数2");
		String s2=sc.nextLine();
		int i=Integer.parseInt(s1);
		method.invoke(obj, i,s2);
		
		
		
		
		
		
		
		
	}

}






