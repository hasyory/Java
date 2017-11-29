package test.mypac;

public class attackUnit {
	public static final int FIST=0;
	public static final int SWORD=1;
	public static final int GUN=2;
	
	private int weaponState=0;
	
	//무기의 상태를 바꾸는 메소드
	public void setWeaponState(int weaponState) {
		this.weaponState = weaponState;
	}
	//공격하는 메소드
	public void attack() {
		if(weaponState==this.FIST) {
			System.out.println("주먹 팡");
		}else if(weaponState==this.SWORD) {
			System.out.println("검 쉬익");
		}else if(weaponState==this.GUN) {
			System.out.println("총 탕탕");
		}
	}
}
