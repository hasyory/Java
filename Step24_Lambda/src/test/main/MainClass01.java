package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("스레드에서 A 작업 수행");
			}
		}).start();
		
		//() : run() 를 가르킴
		//{} : run() 의 내용을 가르킴?
		// ()->{} 구현해야할 메소드가 하나일 때 사용할 수 있다.
		new Thread(()->{
			System.out.println("Test!");
		}).start();
	}
}
