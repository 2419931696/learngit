package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池主要有两个作用:
 * 1:重用线程
 *   线程若频繁的创建销毁会给线程调度带来不小的额外工作
 *   量，会降低性能。
 * 2:控制线程数量
 *   线程数量过大，会导致系统资源开销大,每个线程都需要
 *   内存来得以运行。
 *   还有一个问题是，过多的线程会导致CPU过度切换，导致
 *   整体的并发性能降低。
 * 当有以上情况出现时，都应当使用线程池来管理线程。    
 * @author adminitartor
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService threadPool 
			= Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++){
			Runnable runnable = new Runnable(){
				public void run(){
					try {
						Thread thread = Thread.currentThread();
						System.out.println(thread.getName()+"正在执行任务...");
						Thread.sleep(5000);
						System.out.println(thread.getName()+"执行任务完毕!");
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			};
			//将任务指派给线程池
			threadPool.execute(runnable);
			System.out.println("将任务交给了线程池");
		}
		
		//关闭线程池
//		threadPool.shutdown();
		threadPool.shutdownNow();
		System.out.println("线程池关闭了");
	}
}

















