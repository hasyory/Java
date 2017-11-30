package test.main;

import java.io.IOException;
import java.io.InputStream;

/*
 * 	[InputStream]
 * 	-1byte 처리 스트림(byte 알갱이의 흐름)
 * - 문자의 경우는 영문자 대소문자, 숫자, 특수문자 한글자를 읽을 수 있다
 * - 한글은 처리 불 가 
 * 
 * [Input]

InputStream

파일 자체의 바이트를 읽는
FileInputStream

파일에서 문자열을 읽는
FileReader

InputStreamReader

BufferedReader


[Output]

OutputStream

파일 자체의 바이트를 참조하는
FileOutputStream

파일에서 문자열을 참조하는
FileWriter

OutputStreamReader

BufferedWriter

 */
public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * 키보드로 부터 한개의 글자 코드를 입력받아서 콘솔에 출력
		 */
		//키보드로부터 입력받을 수 있는 객체의 참조값을 얻어서 변수에 담기;
		InputStream is=System.in;
	
		System.out.print("한글자 입력: ");
		try {
			//입력한 키의 코드값을 받아옴
			int keyCode=is.read();
			System.out.println("keyCode: "+keyCode);
			char ch = (char)keyCode;
			System.out.println("char 형으로 변환한 값: "+ch);
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
