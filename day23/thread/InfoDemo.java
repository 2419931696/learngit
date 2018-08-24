package thread;

import org.omg.CORBA.LongHolder;

/**
 * 线程提供了获取线程信息的相关方法
 * @author adminitartor
 *
 */
public class InfoDemo {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		//获取线程的唯一标示
		long id = main.getId();
		System.out.println("id:"+id);
		//获取线程名字
		String name = main.getName();
		System.out.println("name:"+name);
		//获取线程优先级
		int priority = main.getPriority();
		System.out.println("优先级:"+priority);
		//判断线程是否处于活动状态
		boolean isAlive = main.isAlive();
		System.out.println("isAlive:"+isAlive);
		//判断线程是否为守护线程
		boolean isDaemon = main.isDaemon();
		System.out.println("isDaemon:"+isDaemon);
		//判断线程是否是被中断的
		boolean isInterrupted = main.isInterrupted();
		System.out.println("isInterrupted:"+isInterrupted);
		
		
		
		
	}
}









