package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 使用新循环遍历集合
 * @author adminitartor
 *
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/*
		 * 新循环遍历集合最终会被编译器改编为迭代器遍历
		 * 所以在使用新循环遍历集合的过程中不要通过集合
		 * 的方法增删元素。
		 */
		for(Object o : c){
			String str = (String)o;
			System.out.println(str);
		}
	}
}







