package thread;
/**
 * 线程是并发运行的，即多个线程运行时靠线程调度统一管理
 * 线程调度程序会分配给线程CPU时间片段，得到时间片的线程
 * 被CPU执行，当超时后CPU会停止执行该线程，此时线程调度
 * 会再次分配时间片给某个线程继续操作。
 * 所以多个线程之间，每个线程的运行都是走走停停的，这种
 * 运行方式称为并发运行。由于CPU在所有线程间快速切换运行，
 * 感官上这些线程的代码都是"同时运行"的。
 * 
 * 线程的创建有两种方式:
 * 1:继承Thread，并重写run方法来定义要运行的任务。
 * 
 * 
 * @author adminitartor
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		/*
		 * 启动线程要调用线程的start方法，而不是直接
		 * 调用run方法。
		 * start方法会将当前线程纳入线程调度，使线程
		 * 可以并发运行。当start方法执行后，该线程的
		 * run方法会很快被自动执行.
		 */
		t1.start();
		t2.start();
	}
}
/**
 * 第一种创建线程的方式结构简单，利于使用匿名内部类创建
 * 
 * 但是也存在两个明显的不足:
 * 1:由于需要继承Thread，而java本身是单继承的，这就导致
 * 如果继承Thread就不能继承其他类，这在实际开发中会有诸
 * 多不便。
 * 
 * 2:继承Thread后需要重写run方法来定义线程要执行的任务，
 * 这就导致线程与任务存在了一个必然的耦合关系，不利于线
 * 程的重用。
 * 
 */
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你是谁啊?");
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("我是查水表的!");
		}
	}
}









