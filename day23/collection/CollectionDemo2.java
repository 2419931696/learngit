package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合只能存放引用类型元素，并且保存的是元素的引用(地址)
 * @author adminitartor
 *
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Point p = new Point(1, 2);
		
		c.add(p);
		System.out.println("p:"+p);
		System.out.println("c:"+c);
		
		p.setX(2);
		System.out.println("p:"+p);
		System.out.println("c:"+c);//[(2,2)]
		
	}
}













