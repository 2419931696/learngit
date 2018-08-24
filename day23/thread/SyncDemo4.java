package thread;
/**
 * 互斥锁
 * 当synchronized修饰多段代码，但是它们的同步监视器对象
 * 是同一个时，这些代码之间就是互斥的。即:多个线程不能同
 * 时运行这些方法。
 * @author adminitartor
 *
 */
public class SyncDemo4 {
	public static void main(String[] args) {
		final Foo foo = new Foo();		
		Thread t1 = new Thread(){
			public void run(){
				foo.methodA();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				foo.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}

class Foo{
	public synchronized void methodA(){
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":正在运行A方法...");
			Thread.sleep(5000);
			System.out.println(t.getName()+":运行A方法完毕...");
			
		} catch (Exception e) {			
		}
	}
	public void methodB(){
		synchronized(this){
			try {
				Thread t = Thread.currentThread();
				System.out.println(t.getName()+":正在运行B方法...");
				Thread.sleep(5000);
				System.out.println(t.getName()+":运行B方法完毕...");
				
			} catch (Exception e) {			
			}
		}
	}
}








