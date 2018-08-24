package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean remove(E e)
 * 从集合中删除给定元素
 * @author adminitartor
 *
 */
public class RemoveDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1, 2));
		c.add(new Point(3, 4));
		c.add(new Point(5, 6));
		System.out.println(c);
		
		Point p = new Point(1, 2);
		/*
		 * 删除也是删除集合中与给定元素equals比较为true
		 * 的元素，对于List而言，重复元素只删除第一个
		 */
		c.remove(p);
		System.out.println(c);
		
		
	}
}














