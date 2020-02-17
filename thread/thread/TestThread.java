class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;

	ThreadDemo( String name) {
		threadName = name;
		System.out.println("Creating " +  threadName );
	}

	public void run() {
		System.out.println("Running " +  threadName );
		try {
			for(int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				Thread.sleep(50);
			}
		}catch (InterruptedException e) {
			System.out.println("Thread " +  threadName + " interrupted.");
		}
		System.out.println("Thread " +  threadName + " exiting.");
	}

	public void start () {
		System.out.println("Starting " +  threadName );
		if (t == null) {
			t = new Thread (this, threadName);
			t.start ();
		}
	}
}
/* 采用实现 Runnable、Callable(有返回值) 接口的方式创建多线程时，
线程类只是实现了 Runnable 接口或 Callable 接口，还可以继承其他类,实现其他功能*/
public class TestThread {
	public static void main(String args[]) {
		ThreadDemo test1 = new ThreadDemo( "Thread-1");
		test1.start();
		ThreadDemo test2 = new ThreadDemo( "Thread-2");
		test2.start();
	}   
}

