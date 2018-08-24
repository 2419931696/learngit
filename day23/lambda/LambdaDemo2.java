package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 有参方法
 * @author adminitartor
 *
 */
public class LambdaDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("苍老师");
		list.add("小泽老师");
		list.add("传奇");	
		//匿名内部类形式实现比较器
//		Comparator<String> com = new Comparator<String>() {
//			public int compare(String o1, String o2) {
//				return o1.length()-o2.length();
//			}
//		};
		//lambda形式
//		Comparator<String> com = (String o1, String o2)->{
//			return o1.length()-o2.length();
//		};
		
		//方法中参数的类型可以不指定
//		Comparator<String> com = (o1,o2)->{
//			return o1.length()-o2.length();
//		};
		
		//忽略"{}"的同时，若方法有return,则return关键字也要忽略
		Comparator<String> com 
			= (o1,o2)->o1.length()-o2.length();
		
		Collections.sort(list,com);
		System.out.println(list);
		
		
		
		
		
	}
}
