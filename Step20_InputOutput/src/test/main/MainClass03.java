package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class MainClass03 {
	public static void main(String[] args) {
		//키보드와 연결된 객체의 참조값
		InputStream is=System.in;
		InputStreamReader isr = new InputStreamReader(is);
		//InputStreamReader 객체의 참조값을 생성자의 인자로
		//전달하면서BufferedReader 객체 생성하기
		/*
		  	InputStream - byte
			InputStreamReader - character
			BufferedReader - String
		 */
		BufferedReader br=new BufferedReader(isr);
		try {
			System.out.print("한줄 입력: ");
			String strs=br.readLine();
			System.out.println("입력한 문자열: "+strs);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
