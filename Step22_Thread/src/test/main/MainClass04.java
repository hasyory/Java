package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		//익명의 local inner 클래스를 이용해서 스레드 시작시키기
		new Thread() {
			@Override
			public void run() {
				System.out.println("하이 뉴스레드");
			}
		}.start();
	}
}
