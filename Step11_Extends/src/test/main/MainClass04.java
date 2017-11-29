package test.main;

import test.mypac.*;

public class MainClass04 {
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		
		//원래 HandPhone 객체의 참조값이기 때문에
		//SmartPhone 으로 casting은 설정시에 오류가 발생함
		SmartPhone p2 = (SmartPhone)p1;
		p2.doInternet();
	}
}
