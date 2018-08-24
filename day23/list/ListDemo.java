package list;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List 接口
 * List是Collection的子接口，规定了List方法的相关功能
 * List集合的特点是:可重复，并且有序。提供了一组通过下标
 * 操作元素的方法
 * 
 * 常用实现类:
 * java.util.ArrayList:内部由数组实现，查询效率好，但是
 * 增删元素效率差
 * 
 * java.util.LinkedList:内部由链表实现，查询效率差但是
 * 增删效率好，尤其首尾增删元素效率高。
 * 
 * 在对元素操作效率没有特别苛刻要求时，通常使用的都是
 * ArrayList这个集合。
 * @author adminitartor
 *
 */
public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);		
		/*
		 * List提供了重载的add,remove
		 * 
		 * void add(int index,E e)
		 * 将给定元素插入到指定位置
		 */
		list.add(1, "2");
		System.out.println(list);
		
		/*
		 * 删除第三个元素
		 * 
		 * E remove(int index)
		 * 删除并返回指定下标对应的元素
		 */
		String old = list.remove(2);
		System.out.println(list);
		System.out.println("old:"+old);
	}
}









