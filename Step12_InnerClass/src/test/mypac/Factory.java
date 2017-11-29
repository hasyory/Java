package test.mypac;

public class Factory {

	public Car car= new Car() {
		@Override
		public void drive() {
			System.out.println("부오아아아아아아앙");
		};
	};
	
	//멤버 필드에 있는 Car 객체를 생성하는 메소드
	public void useCar() {
		car.drive();
	}
	
	public Car getCar() {
		return car;
	}
}
