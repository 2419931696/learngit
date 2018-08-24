package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 集合的排序
 * 集合提供了一个工具类:java.util.Collections
 * 集合的工具类提供了若干静态方法，可以方便我们对集合做
 * 一系列操作，其中之一就是排序。
 * 需要注意，提供的方法只能对List集合排序，因为Set集合
 * 不全是有序的。
 * @author adminitartor
 *
 */
public class SortListDemo1 {
	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		/*
		 * sort方法会对集合元素进行自然排序(从小到大)
		 */
		Collections.sort(list);
		System.out.println(list);
		
	}
}










