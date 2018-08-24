package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 并发安全的集合
 * @author adminitartor
 *
 */
public class SyncCollectionDemo {
	public static void main(String[] args) {
		/*
		 * 集合的工具类Collections可以将现有的集合转换
		 * 为一个线程安全的，对于集合自身的操作如:add,
		 * remove等都可以保证并发安全。
		 * 但是API手册也有说明，一个并发安全的集合也不与
		 * 使用迭代器遍历操作做互斥，这意味着并发操作中
		 * 遍历与集合自身操作并非并发安全的，需要自行维护
		 * 互斥关系。
		 */
		/*
		 * List的常用实现类:ArrayList,LinkedList都
		 * 不是线程安全的
		 * 可以通过Collections将List转换为线程安全的
		 */
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println(list);
		
		list = Collections.synchronizedList(list);
		System.out.println(list);
		
		
		//HashSet也不是线程安全的  
		Set<String> set = new HashSet<String>(list);
		set = Collections.synchronizedSet(set);
		System.out.println(set);
		
		
		
	}
}






