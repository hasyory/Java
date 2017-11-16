package test.mypac;

public class MyUtil {
	// static 멤버 필드 정의하기, public은 접근지정자
	public static String version = "v2.0";
	
	public static void sendMessage() {
		System.out.println("메세지를 전송합니다.");
	}
	
	public static void screenCapture() {
		System.out.println("화면을 캡쳐합니다.");
	}
}
