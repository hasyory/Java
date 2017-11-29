package test.mypac;

public class MyWeapon extends Weapon{
	//abstract된 메소드를 반드시 override 해서 상세내용을 정의해줘야함
	@Override
	public void attack() {
		System.out.println("몬스터를 공격해요");
	}
}
