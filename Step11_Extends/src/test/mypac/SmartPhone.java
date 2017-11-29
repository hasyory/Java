package test.mypac;

public class SmartPhone extends HandPhone{
	public SmartPhone() {
		System.out.println("SmartPhone() 생성자 호출");
	}
	public void doInternet() {
		System.out.println("웹 브라우저를 열었어요!");
	}
	@Override
	public void takePicture() {
		super.takePicture(); // 부모 객체의 takePicture()를 호출
		System.out.println("눈으로 본듯한 사진을 찍는다!");
	}
}
