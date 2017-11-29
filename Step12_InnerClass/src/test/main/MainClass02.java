package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//메소드 안에서 내부메소드 클래스를 정의할 수 있다.
		//Local Inner Class
		class Hk{
			public void say() {
				System.out.println("안녕 난 하경이!");
			}
		}
		Hk h=new Hk();
		h.say();
	}
}
