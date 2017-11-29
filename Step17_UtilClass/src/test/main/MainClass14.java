package test.main;

public class MainClass14 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		//java.lang.StringBuilder
		StringBuilder builder=new StringBuilder();
		
		String myStr="";
		
		for(int i=0; i<10; i++) {
			builder.append("누적1");
			//가변 배열을 15개 만들어서 문자열 추가하고, 배열 15개에 다 차면 또 15개를 생성해서 넣음
			myStr=myStr+"누적2";
			//연결 연산시 해당 문자열이 연결된 새로운 객체가 만들어짐
			//가비지가 생긴닥!
		}
		//StringBuilder 객체에 누적된 문자열을 String type
		//으로 얻어내기
		String str=builder.toString();
		System.out.println(str);
		System.out.println(myStr);
	}
}
