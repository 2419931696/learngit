package thread;

/**
 * 线程提供了一个方法: void join() 该方法可以使一个线程在另一个线程上等待(置于阻塞状态)， 直到其完成工作后再继续运行。
 * join可以协调线程之间的同步运行。
 * 
 * 同步:执行有先后顺序的称为同步运行。 异步:执行无先后顺序，通常并发运行代码就是异步运行。
 * 
 * @author adminitartor
 *
 */
public class JoinDemo {
	// 表示图片是否下载完毕
	private static boolean isFinish = false;

	public static void main(String[] args) {
		final Thread download = new Thread() {
			public void run() {
				System.out.println("down:开始下载图片...");
				for (int i = 1; i <= 100; i++) {
					System.out.println("down:" + i + "%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("down:图片下载完毕!");
				isFinish = true;// 图片下载完了
			}
		};

		Thread show = new Thread() {
			public void run() {
				System.out.println("show:开始显示图片...");
				// 加载前先等在下载线程将图片下载完毕
				try {
					/*
					 * 当show线程执行download.join()方法后， show线程就进入了阻塞状态，直到download
					 * 线程停止后才会解除阻塞。
					 */
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				// 图片若没有下载完毕则抛出异常
				if (!isFinish) {
					/*
					 * 当一个异常抛出到run方法之外，意味着 这个线程就停止了(实际开发中尽量避免 这样做)。
					 */
					throw new RuntimeException("图片加载失败!");
				}
				System.out.println("show:显示图片完毕!");
			}
		};
		download.start();
		show.start();

	}
}
