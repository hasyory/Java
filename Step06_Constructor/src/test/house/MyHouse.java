package test.house;

public class MyHouse {
	/*
	 * 참조 데이터 type 필드에 null을 넣고 싶으면
	 * =null은 생략 할 수 있다.
	 */
	public Aircon air = null;
	public Television tv;
	public Microwave mw;
	
	// 디폴트 생성자
	public MyHouse() {

	}
	
	// 인자로 Aircon, Televsion, Microwave 객체를 전달받는 생성자
	public MyHouse(Aircon air, Television tv, Microwave mw) {
		this.air = air;
		this.tv = tv;
		this.mw = mw;
	}
	
	
}
