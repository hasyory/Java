package test.armory;

public class MachineGun extends Gun{
	//자식 생성자에서 부모 생성자에 필요한 값을 전달 받아서
	public MachineGun(Bullet bullet) {
		//부모 생성자에 넘겨 줌.
		//부모 생성자를 호출하는 코드는 가장 첫줄에 와야함
		super(bullet);
	}
	
	//메소드
	public void autoFire() {
		if(this.bullet==null) {
			System.out.println("총알 객체가 없어서 발사불가!");
		}
		System.out.println("두두두두두다다다다댜댜댜댜댜댜댜");
	}
}
