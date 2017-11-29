package test.main;

import test.mypac.attackUnit;

public class MainClass03 {
	public static void main(String[] args) {
		attackUnit unit1=new attackUnit();
		
		//무기 설정
		unit1.setWeaponState(attackUnit.FIST);
		unit1.attack();
		
		unit1.setWeaponState(1);
		unit1.attack();
		
		unit1.setWeaponState(2);
		unit1.attack();
		
	}
}
