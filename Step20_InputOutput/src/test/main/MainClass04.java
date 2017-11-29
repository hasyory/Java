package test.main;

import java.io.IOException;
import java.io.OutputStream;

public class MainClass04 {
	public static void main(String[] args) throws IOException {
		//콘솔이 출력할 수 있는 OutputStream 객체의 참조값
		OutputStream os=System.out;
		//출력할 준비
		os.write(97);
		os.write(98);
		os.write(99);
		os.write(100);
		
		//방출해서 출력하기
		os.flush();
		
		byte[] buff= {65,66,67,68};
		//byte[] 객체를 출력할 준비
		os.write(buff);
		//출력
		os.flush();
		
		//스트림 닫기
		os.close();
		
		//닫은 이후에는 출력 불가
		os.write(69);
		os.flush();
		//System 클래스의 out이라는 필드에 있는 스트림을
		// 닫았기 때문에 출력이 안됨.
		System.out.println("메인 종료");
	}
}
