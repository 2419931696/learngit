package queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * BlockingQueue与BlockingDeque(双端)
 * 阻塞队列
 * 
 * 阻塞队列是并发安全的队列，并且内部由双队列实现双缓冲
 * 操作，存取无互斥，提高并发效率
 * @author adminitartor
 *
 */
public class BlockingDequeDemo {
	public static void main(String[] args) {
		BlockingQueue<String> queue 
			= new LinkedBlockingQueue<String>();
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		
		System.out.println(queue);
	}
}










