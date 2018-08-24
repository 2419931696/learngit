package thread;
/**
 * 守护线程
 * 守护线程也称为后台线程，默认创建的线程都不是守护线程
 * 也可称为默认创建的线程为普通线程或前台线程。
 * 
 * 守护线程在使用上与普通线程一样，但是在结束时机上有一
 * 点不同，即:进程结束时
 * 
 * 进程的结束:当一个进程中的所有普通线程都结束时，进程
 * 就会结束，这时进程中所有运行的守护线程都会被强制中断
 * 
 * GC就是运行在守护线程上的。通常当一个任务我们不关心其
 * 何时结束，只要主要的业务都执行完毕后可以跟着结束的任务
 * 就可以运行在一个守护线程上。
 * 
 * @author adminitartor
 *
 */
public class DaemonThreadDemo {
	public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("rose:啊啊啊啊啊AAAAAAaaaaa....");
				System.out.println("噗通。");
			}
		};
		
		Thread jack = new Thread(){
			public void run(){
				while(true){
					System.out.println("jack:you jump!i jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};	
		rose.start();
		
		/*
		 * 设置为守护线程,注:要在该线程启动之前进行设置
		 */
		jack.setDaemon(true);
		jack.start();
		
//		while(true){
//			
//		}
	}
}










