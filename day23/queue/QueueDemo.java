package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue  队列
 * Queue接口继承自Collection。队列可以保存一组元素，
 * 但是存取元素必须遵循先进先出原则。
 * 
 * 常用实现类:java.util.LinkedList
 * 由于链表可以保存一组元素，并且首尾增删元素效率好，它
 * 满足队列相关操作特性。
 * 
 * @author adminitartor
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		//入队操作，将元素加入到队列末尾
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		queue.offer("five");
		System.out.println(queue);
		
		int size = queue.size();
		System.out.println(size);
		
		/*
		 * 出队操作
		 * 获取队首元素后，该元素即从队列中被移除
		 */
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * E peek()
		 * 引用队首元素，获取队首元素后，该元素仍然保留
		 * 在队列中
		 */
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * 使用迭代器可以遍历队列。
		 */
		for(String s : queue){
			System.out.println(s);
		}
		System.out.println(queue);
	}
}









