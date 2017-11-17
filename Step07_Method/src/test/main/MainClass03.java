package test.main;

import test.mypac.*;

public class MainClass03 {
	public static void main(String[] args) {
		// MyUtil getCar() 호출, car1에 저장
		Car car1 = MyUtil.getCar();
		// car1의 drive() 메소드 호출
		car1.drive();
	}
}
