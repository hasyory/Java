package test.main;

import test.mypac.Car;
import test.mypac.Gura;

/*
 * 	[ 클래스의 역할 ]
 * 	
 * 	1. static 멤버를 가지고 있는 역할
 * 	2. 객체의 설계도 역할
 * 	- 객체는 데이터의 저장소(field)와 기능(method)으로 이루어져 있음
 *  - field는 참조, method는 call
 * 	- 클래스명이 객체의 Type역할을 함
 * 	3. Data Type 역할
 * 
 * */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		// Car Type 객체의 참조값을 담을 지역변수 만들기 (지역변수는 stack영역에 만들어짐, 객체는 heap영역에 만들어짐)
		Car car1 = null;
		// car 객체를 생성하고 참조값을 변수에 대입하기
		car1 = new Car();
		
		// Gura Type 객체의 참조값을 담을 지역변수 만들기
		Gura gura1 = null;
		
		// Gura 객체를 생성하고 참조값을 변수에 대입하기
		gura1 = new Gura();
		
	}
}
