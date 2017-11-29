package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		SmartPhone p1=new SmartPhone();
		Object p2=p1;
		
		usePhone(p1);
		useHandPhone(p1);
		useSmartPhone(p1);
		
		//캐스팅
		usePhone((Phone)p2);
		useHandPhone((HandPhone)p2);
		useSmartPhone((SmartPhone)p2);
		
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
