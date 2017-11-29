package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("메인시작");
		
		//Runnable 구현한 객체를 얻어내서
		Runnable run1=new Runnable() {
			@Override
			public void run() {
				System.out.println("달려라");
			}
		};
		//스레드 시작
		new Thread(run1).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("뛰어라");
			}
		}).start();
		System.out.println("메인종료");
	}
}
