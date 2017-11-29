package test.mypac;

public class HandPhone extends Phone{ //Phone Class를 상속 받기
	public HandPhone() {
		System.out.println("HandPhone() 생성자 호출!");
	}
	
	//이동중에 전화를 거는 메소드
	public void mobileCall() {
		System.out.println("이동중에 전화건다!");
	}
	public void takePicture() {
		System.out.println("사진 찍는다!");
	}
}
