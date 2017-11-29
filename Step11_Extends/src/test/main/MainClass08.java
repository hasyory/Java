package test.main;
import test.auto.*;
public class MainClass08 {
	public static void main(String[] args) {
		Sedan car1=new Sedan();
		//오버라이딩 된 메소드 호출해보기
		car1.drive();
		//Sedan 객체를 useCar() 메소드의 인자로 전달
		MainClass07.useCar(car1);
	}
}
