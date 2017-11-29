package test.mypac;
/*
 * 	인터페이스를 구현 할 때는 implements 예약어를 사용한다.
 * 	여러개의 인터페이스를 구현 할 수도 있다. (다중 구현 가능)
 * 	인터페이스에 정의된 모든 추상메소드를 오버라이딩 해야 한다.
 */
public class MyRemocon extends SmartFunction implements Remocon{
	
	@Override
	public void up() {
		System.out.println("온도 +1");
	}

	@Override
	public void down() {
		System.out.println("온도 -1");
	}
	
}

