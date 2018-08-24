package thread;
/**
 * 线程提供了一个静态方法:
 * static Thread currentThread()
 * 该方法可以获取到运行这个方法的线程
 * 
 * 在ThreadLocal这个API中就要利用这个方法完成操作。
 * 而ThreadLocal在后期有很多应用，比如Spring利用AOP完成
 * 事务控制时就要使用到。
 * 
 * @author adminitartor
 *
 */
public class CurrentThreadDemo {
	public static void main(String[] args) {
		//获取运行main方法的线程
		Thread main = Thread.currentThread();
		System.out.println("运行main方法的线程为:"+main);
		dosome();
		
		Thread thread = new Thread(){
			public void run(){
				Thread t = Thread.currentThread();
				System.out.println("自定义线程:"+t);
				dosome();
			}
		};
		thread.start();
	}
	
	public static void dosome(){
		Thread thread = Thread.currentThread();
		System.out.println("运行dosome方法的线程是:"+thread);
	}
}









