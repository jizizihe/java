class RunnableDemo implements Runnable {
	private Thread t;
	private String threadName;

	RunnableDemo(String name) {
		threadName = name;
		System.out.println("Creating"+threadName);
	}

	public void run() {//重写run
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

	public void start () {//启动线程
		System.out.println("Starting " +  threadName );
		if (t == null) {
			t = new Thread (this, threadName);
			t.start ();
		}
	}
}

public class TestRunnable {
	public static void main(String args[]) {
		RunnableDemo test1 = new RunnableDemo("test1");
		test1.start();
		RunnableDemo test2 = new RunnableDemo("test2");
		test2.start();
	}
}
