package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		//1. usePhone() 메소드를 오류없이 호출해보슈
		usePhone(new Phone());
		//2. useHandPhone() 메소드 호출
		useHandPhone(new HandPhone());
		//3. useSmartPhone() 메소드 호출
		useSmartPhone(new SmartPhone());
		/*
		 * SmartPhone p1 = new SmartPhone();
		 * usePhone(p1);
		 * useHandPhone(p1);
		 * useSmartPhone(p1);
		 */
	}
	public static void usePhone(Phone p) {
		p.Call();
	}
	public static void useHandPhone(HandPhone p) {
		p.mobileCall();
	}
	public static void useSmartPhone(SmartPhone p) {
		p.doInternet();
	}
}
