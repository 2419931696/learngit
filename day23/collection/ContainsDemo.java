package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合提供方法：
 * boolean contains(Object o)
 * 判断当前集合是否包含给定元素
 * 
 * @author adminitartor
 *
 */
public class ContainsDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1, 2));
		c.add(new Point(3, 4));
		c.add(new Point(5, 6));
		System.out.println(c);		
		Point p = new Point(1, 2);
		/*
		 * contains的判定标准是看给定的对象p是否与
		 * 集合现有元素存在equals比较为true的，若有
		 * 则认为包含，否则为不包含。
		 * 所以元素equals方法决定这集合判断包含的结果
		 */
		boolean contains = c.contains(p);
		System.out.println("包含:"+contains);
		
		
	}
}











