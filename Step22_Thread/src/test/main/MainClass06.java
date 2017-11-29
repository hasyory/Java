package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		/*
		 * 지역변수는 메소드가 리턴되면 사라짐
		 */
		String name="나나나";
		
		new Thread() {
			@Override
			public void run() {
					System.out.println(name);
			}
		}.start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
					System.out.println(name);
			}
		}).start();
		
		System.out.println("메인 종료");
	}
	
}
