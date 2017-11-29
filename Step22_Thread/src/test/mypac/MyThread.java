package test.mypac;
/*
 * Runnable 인터페이스를 구현한 클래스를 이용해서
 * 스레드를 시작 시킬 수 있음.
 */
public class MyThread implements Runnable{
	@Override
	public void run() {
		System.out.println("MyThread 시작");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MyThread 종료");
	}
	
}
