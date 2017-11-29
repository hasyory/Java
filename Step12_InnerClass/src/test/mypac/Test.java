package test.mypac;

//필드, 생성자, 메소드 외  클래스안에 클래스를 정의할 수 있다!
//내부 클래스
public class Test {
	
	// Hk Type 객체를 생성해서 리턴해주는 메소드
	public Hk getHk() {
		return new Hk();
	}
	
	// Acorn Type 객체를 생성해서 리턴해주는 메소드
	public Acorn getAcorn() {
		return new Acorn();
	}
	
	public class Hk{//내부클래스
		public void say() {
			System.out.println("안녕 난 하경이야!");
		}
	}
	public class Acorn{//내부 클래스
		public void say() {
			System.out.println("난 에이콘이다!");
		}
	}
}
