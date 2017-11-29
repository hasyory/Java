package test.armory;

public class SniperGun extends Gun {
	public SniperGun(Bullet bullet) {
		super(bullet);
	}
	@Override
	public void fire() {
		/*
		 * super는 부모객체의 참조값을 가리키는 예약어 이다.
		 * super.fire(); 재정의 대상이된 부모 메소드를
		 * 호출하는 표현식이다.
		 */
		//super.fire();
		System.out.println("정밀하게 빵!");
	}
}
