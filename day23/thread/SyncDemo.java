package thread;
/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一资源时，由于线程切换实际不可控
 * 会导致操作逻辑执行顺序出现混乱，严重时会导致系统瘫痪。
 * 
 * @author adminitartor
 *
 */
public class SyncDemo {
	public static void main(String[] args) {
		final Table table = new Table();
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();//模拟线程切换
					System.out.println(getName()+":"+bean);
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				while(true){
					int bean = table.getBean();
					Thread.yield();//模拟线程切换
					System.out.println(getName()+":"+bean);
				}
			}
		};
		
		t1.start();
		t2.start();
		
	}
}


class Table{
	private int beans = 20;
	/**
	 * 当一个方法被synchronized修饰后，该方法变成
	 * 同步方法，即:多个线程无法同时在该方法内部运行。
	 * 将并发操作改为同步操作可以解决并发安全问题
	 * 
	 * 在方法上使用synchronized，那么同步监视器对象就是
	 * 当前方法所属对象，即:方法中看到的this
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("没有豆子了!");
		}
		/*
		 * 当一个线程执行到Thread的静态方法yield后，该
		 * 线程会主动放弃本次CPU时间片，回到RUNNABLE状
		 * 态，等待线程调度再次分配时间片.
		 * 注:线程没有方法可以主动获取时间片。但可以主动
		 * 放弃时间片。
		 */
		Thread.yield();//模拟线程切换
		return beans--;
	}
}













