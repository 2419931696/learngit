package thread;
/**
 * 线程提供了一个静态方法:
 * static void sleep(long ms)
 * 该方法会将运行该方法的线程置于阻塞状态指定毫秒。当
 * 超时后，线程会重新回到RUNNABLE状态，等待获取CPU时间片
 * 再次并发运行
 * @author adminitartor
 *
 */
public class SleepDemo {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("程序结束了");
	}
}










