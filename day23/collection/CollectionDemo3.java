package collection;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

/**
 * 集合操作
 * @author adminitartor
 *
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("java");
		c1.add("c");
		c1.add("c++");
		
		Collection c2 = new ArrayList();
		c2.add("android");
		c2.add("ios");
	
		/*
		 * boolean addAll(Collection c)
		 * 添加完毕后，当前集合元素发生改变则返回true
		 */
		c1.addAll(c2);
		System.out.println("c1:"+c1);
		
		Collection c3 = new ArrayList();
		c3.add("java");
		c3.add("ios");
//		c3.add("php");
		/*
		 * boolean containsAll(Collection c)
		 * 判断当前集合是否包含给定集合中的所有元素
		 */
		boolean contains = c1.containsAll(c3);
		System.out.println("全包含:"+contains);
		
		
		/*
		 * boolean removeAll(Collection c)
		 * 删除当前集合与给定集合的公有元素
		 */
		c1.removeAll(c3);
		System.out.println("c1:"+c1);
		
		
	}
}







