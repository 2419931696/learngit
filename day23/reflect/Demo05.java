package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("����������");
		String line=sc.nextLine();
		Class cls=Class.forName(line);
		Object obj=cls.newInstance();
		System.out.println("�����뷽����");
		String methodname=sc.nextLine();
		Method method=cls.getDeclaredMethod(methodname,int.class,String.class);//���س�����
		System.out.println(method);
		System.out.println("�������1");
		String s1=sc.nextLine();
		System.out.println("�������2");
		String s2=sc.nextLine();
		int i=Integer.parseInt(s1);
		method.invoke(obj, i,s2);
		
		
		
		
		
		
		
		
	}

}






