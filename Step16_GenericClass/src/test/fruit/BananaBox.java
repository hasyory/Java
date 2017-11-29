package test.fruit;

public class BananaBox {
	//멤버 필드
	private Banana item;
	//객체를 저장하는 메소드
	public void push(Banana item) {
		this.item=item;
	}
	//객체를 리턴해주는 메소드
	public Banana pull() {
		return item;
	}
}
