package test.fruit;
/*
 * 일반화된 클래스
 */
public class OrangeBox {
	//멤버 필드
	private Orange item;
	//객체를 저장하는 메소드
	public void push(Orange item) {
		this.item=item;
	}
	//객체를 리턴해주는 메소드
	public Orange pull() {
		return item;
	}
}
