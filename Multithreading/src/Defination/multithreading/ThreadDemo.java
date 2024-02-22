package Defination.multithreading;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		for(int i=0; i<5; i++) {
			System.out.println("Main Thread");
		}
		
		String threadName = t.currentThread().getName();
		System.out.println(threadName);
		t.currentThread().setName("Masood");
		System.out.println(t.currentThread().getName());
		
		ThreadRunnable r = new ThreadRunnable();
		Thread t2 = new Thread(r);
		t2.start();
		System.out.println(t2.getName());
		
	}
}
