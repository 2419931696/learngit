package thread;
/**
 * 当一个线程调用sleep方法后进入阻塞状态，在这个过程
 * 中若被其它线程调用了该线程的interrupt方法中断时，
 * 这时并非直接将该线程中断，而是会打断其睡眠阻塞，这时
 * sleep方法会抛出中断异常。
 * 所以，当一个线程处于阻塞时，inerrupt方法是中断阻塞
 * 状态，否则是中断该线程。
 * @author adminitartor
 *
 */
public class SleepDemo2 {
	public static void main(String[] args) {
		/*
		 * JDK1.8之前，由于JVM内存分配问题，有一个要求:
		 * 当一个方法中的局部变量(包括该方法参数)若被
		 * 这个方法的其他局部内部类所引用时，该变量必须
		 * 被声明为final的
		 */
		final Thread lin = new Thread(){
			public void run(){
				System.out.println("林:刚美完容，睡一会吧~");
				try {
					Thread.sleep(1000000);
				} catch (InterruptedException e) {
					System.out.println("林:干嘛呢！干嘛呢！干嘛呢！都破了相了!");
				}
				System.out.println("林:醒了");		
			}
		};
		
		Thread huang = new Thread(){
			public void run(){
				System.out.println("黄:开始砸墙!");
				for(int i=0;i<5;i++){
					System.out.println("黄:80!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("咣当！");
				System.out.println("黄:搞定!");
				lin.interrupt();//中断lin线程
			}
		};
		
		huang.start();
		lin.start();
		
	}
}









