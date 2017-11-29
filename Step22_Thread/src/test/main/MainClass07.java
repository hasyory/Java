package test.main;

public class MainClass07 {
	public static void main(String[] args) {
		new MyThread().start();
		
		Runnable run=new MyRunnable();
		new Thread(run).start();
	}
	class MyThread2 extends Thread{
		@Override
		public void run() {
			
		}
	}
	static class MyThread extends Thread{
		@Override
		public void run() {
			
		}
	}
	static class MyRunnable implements Runnable{
		@Override
		public void run() {
			
		}
	}
	
}
