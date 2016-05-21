package Threads;

public class MyRunnable implements Runnable{
	private long startTime;
	private long timeElapsed;
	private long endTime;
	private long methodEntryTime;
	private String variable;
	private Object lock = new Object();
	
	@Override
	public void run() {
		synchronized (lock) {
		startTime = System.currentTimeMillis();
		timeElapsed = 0;
		for(int i = 1; i<=100; i++){
			methodEntryTime = System.currentTimeMillis();
			if(i%10 == 0) {
				System.out.println("Counted " + i + " numbers");
				System.out.println("current running thread -> " + Thread.currentThread().getName() + " with var value -> " + variable);
			}
			try {
				//System.out.println("time before sleep -> " + System.currentTimeMillis());
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			/*System.out.println("time after sleep -> " + System.currentTimeMillis());
			timeElapsed = System.currentTimeMillis() - methodEntryTime;
			System.out.println("total time elapsed -> " + (System.currentTimeMillis() - startTime));
			System.out.println("for loop time -> " + (timeElapsed));*/
		}
		endTime = System.currentTimeMillis();
		}
	}

	public void setVariable(String var){
			this.variable = var;
	}
}
