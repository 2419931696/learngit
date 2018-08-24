package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection 集合
 * 集合可以保存一组元素，并且提供了操作元素的相关方法。
 * Collection下面有两个常用的子接口：
 * java.util.List:线性表，可重复，并且有序
 * java.util.Set:不可重复
 * 
 * 是否重复指的是元素是否可以重复，而判定是否重复的标准
 * 是依靠元素自身equals比较的结果。
 * 
 * @author adminitartor
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * boolean add(E e)
		 * 将给定元素添加到集合当中，当成功添加后方法
		 * 会返回true，添加失败返回false
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/*
		 * int size()
		 * 获取当前集合元素个数
		 */
		int size = c.size();
		System.out.println("size:"+size);
		
		/*
		 * boolean isEmpty()
		 * 判断当前集合是否为空集(不含有任何元素)
		 */
		boolean isEmpty = c.isEmpty();
		System.out.println("是否为空集:"+isEmpty);
		
		/*
		 * void clear()
		 * 清空集合
		 */
		c.clear();
		System.out.println("集合已清空");
		System.out.println("size:"+c.size());
		System.out.println("isEmpty:"+c.isEmpty());
		System.out.println(c);
	}
}







