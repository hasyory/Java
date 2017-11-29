package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		final String name="야옹이";
		
		/*local inner class 를 이용해 스레드 시작
		    지역변수는 접근할 수 없지만, final로 선언된 상수는 가능하다
		  JDK1.7까지는 final이 아닌 지역변수에 접근 할 수 없음
		  1.8부터 final이 아닌 지역변수에 접근할 수 있음
		*/
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("지역변수 name: "+name);
			}
		}).start();

	}
}
