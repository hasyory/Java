package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		// 참조 데이터 type을 담을 수 있는 빈 변수 만들기
		String myName = null; // null을 대입하면 된다.
		
		boolean isRun = true;
		
		if(isRun) {
			myName = "김구라";
		}
		// 변수에 담긴 값이 null인지 아닌지에 따라 선택적인 동작을 해야하는 경우가 있다
		if(myName==null) {
			System.out.println("myName이 null이네?");
		}
		
		System.out.println("메인 메소드가 종료됩니다.");
	}

}
