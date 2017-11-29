package test.main;
import test.auto.*;
public class MainClass07 {
	public static void main(String[] args) {
		Taxi car1=new Taxi();
		Truck car2=new Truck();
		
		car1.startEngine();
		car1.meterOn();
		car1.drive();
		System.out.println("---------------");
		car2.startEngine();
		car2.loading();
		car2.drive();
		System.out.println("---------------");
		
		MainClass07.useCar(car1);
		//Truck객체의 참조값을 전달 했기 때문에 Exception 발생.Taxi형으로 Casting 불가 :26-27
		useCar(car2);
		
	}
	public static void useCar(Car car) {
		car.startEngine();
		car.drive();
		
//		Taxi t1=(Taxi)car;
//		t1.meterOn();
	}
}
