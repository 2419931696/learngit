package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * jdk8之后，集合和Map都提供了一个方法，用lambda方式
 * 遍历元素，并且若该集合或Map是线程安全的，那么这种
 * 遍历方式与元素增删也是并发安全的。
 * 
 * 曾经使用迭代器遍历时我们介绍过，迭代器遍历集合不与
 * 集合自身增删元素互斥，并发操作要自行维护同步。而新
 * 的这种遍历方式无需这样做。
 * @author adminitartor
 *
 */
public class LambdaDemo3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");	
		list.forEach((e)->System.out.println(e));
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		
		map.forEach((k,v)->System.out.println(k+":"+v));
	}
}











