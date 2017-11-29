package test.mypac;

public class YourUtil {
	// static 멤버 필드 정의하기(static 멤버는 class명으로 접근, static이 붙지 않으면 객체를 생성해 참조값에서 접근해야함)
	public static String version = "v1.0";
	
	// static 멤버 메소드
	public static void fileDown() {
		System.out.println("파일을 다운로드 해요!");
	}
	
	public static void fileUp() {
		System.out.println("파일을 업로드 해요!");
	}
}
