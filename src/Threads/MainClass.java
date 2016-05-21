package Threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {
	public static void main(String [] args) throws InterruptedException{
		Runnable rn = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("runnable call");
			}
		};
		Executor ex = new Executor() {
			@Override
			public void execute(Runnable command) {
				Thread thread = new Thread(command);
				thread.setName("1");
				thread.start();
			}
		};
		ex.execute(rn);
		ExecutorService exs = Executors.newFixedThreadPool(5);
	}
}
