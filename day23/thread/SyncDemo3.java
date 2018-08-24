package thread;
/**
 * 静态方法若使用synchronized修饰后，那么该方法一定具有
 * 同步效果。
 * 静态方法所使用的同步监视器对象为其方法所属类的类对象.
 * 类对象，即:Class的一个实例。每个类都有且只有一个Class
 * 实例与之对应（反射知识中会介绍）
 * @author adminitartor
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run() {
				Boo.dosome();
			}
		};
		Thread t2 = new Thread(){
			public void run() {
				Boo.dosome();
			}
		};
		t1.start();
		t2.start();
	}
}

class Boo{
	public synchronized static void dosome(){
		Thread t = Thread.currentThread();
		try {
			System.out.println(t.getName()+":正在运行dosome方法");
			Thread.sleep(5000);
			System.out.println(t.getName()+":运行dosome方法完毕");
		} catch (Exception e) {
		}
	}
}








