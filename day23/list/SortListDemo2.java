package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序自定义类型元素
 * @author adminitartor
 *
 */
public class SortListDemo2 {
	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(3, 6));
		list.add(new Point(1, 8));
		list.add(new Point(2, 4));
		list.add(new Point(5, 7));
		list.add(new Point(9, 0));
		list.add(new Point(3, 4));
		System.out.println(list);
		/*
		 * Collections.sort(List list)
		 * 该方法排序给定集合时对集合元素有一个要求，
		 * 就是元素必须实现了Comparable接口，否则编译
		 * 不通过。
		 */
		Collections.sort(list);
		
		System.out.println(list);
		
		
	}
}







