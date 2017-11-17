package test.main;

import test.mypac.*;

public class MainClass05 {
	public static void main(String[] args) {
		// useCar(Car car) 호출
		MyUtil.useCar(new Car());
		//useCar(String msg, Car car)호출
		MyUtil.useCar("헬로", new Car());
	}
}
