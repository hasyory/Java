package test.main;

import test.fruit.*;

public class MainClass01 {
	public static void main(String[] args) {
		//Generic 클래스는 가변 배열을 사용할 때 자주 사용된다고 함
		
		// Apple을 담고싶음
		AppleBox box1=new AppleBox();
		box1.push(new Apple());
		
		// Banana을 담고싶음
		BananaBox box2=new BananaBox();
		box2.push(new Banana());
		
		// Orange을 담고싶음
		OrangeBox box3=new OrangeBox();
		box3.push(new Orange());
		
		//Generic 을 Apple로 지정해서 객체 생성
		FruitBox<Apple> box4 = new FruitBox<Apple>();
		box4.push(new Apple());
		
		//Generic 을 Banana로 지정해서 객체 생성
		FruitBox<Banana> box5 = new FruitBox<Banana>();
		box5.push(new Banana());

		//Generic 을 Orange로 지정해서 객체 생성
		FruitBox<Orange> box6 = new FruitBox<Orange>();
		box6.push(new Orange());	
	}
}
