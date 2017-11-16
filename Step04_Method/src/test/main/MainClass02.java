package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// showMsg() 메소드를 호출해 보세요.
		MainClass02.showMsg("hello");
		
		String str = "안녕하세요";
		MainClass02.showMsg(str);
		
		// 상황에 따라  null을 전달하는 경우도 있다.
		MainClass02.showMsg(null);
	}
	
	// static 멤버 메소드, class명에 .을 찍어 접근한다.
	public static void showMsg(String msg) {
		System.out.println("msg : " + msg);
	}
}
