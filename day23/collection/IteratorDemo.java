package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 遍历集合
 * Collection提供了统一的遍历集合的方式:迭代器模式
 * 对应方法:
 * Iterator iterator()
 * 该方法可以返回一个用于遍历当前集合的迭代器
 * 
 * java.util.Iterator接口
 * 迭代器接口规定了迭代器遍历集合的相关操作，遍历方式
 * 应当遵循:问，取，删的过程，而删除元素操作不是必须操作。
 * 不同的集合都实现了一个可以遍历自身的迭代器实现类。我们
 * 无需记住实现类的名字，只要当它为Iterator并操作即可(多态)
 * 
 * 
 * @author adminitartor
 *
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		System.out.println(c);
		
		//获取迭代器
		Iterator it = c.iterator();
		/*
		 * boolean hasNext()
		 * 判断集合是否还有下一个元素可以迭代。
		 * 问的过程
		 */
		while(it.hasNext()){
			/*
			 * E next()
			 * 通过迭代器获取集合下一个元素。
			 * 取的过程
			 */
			String str = (String)it.next();
			System.out.println(str);
			/*
			 * 在遍历的过程中删除#操作
			 * 需要注意:
			 * 迭代器有一个要求，就是在遍历的过程中不得
			 * 使用集合的方法增删元素，否则会抛出异常。
			 * 可以通过迭代器自身提供的remove方法删除
			 * 元素。该方法不需要传入参数，删除的是通过
			 * next方法取出的元素。
			 */
			if("#".equals(str)){
//				c.remove(str);
				it.remove();
			}
		}
		
		System.out.println(c);
	}
}
















