package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainClass05 {
	public static void main(String[] args){
		//콘솔이 출력할 수 있는 OutputStream 객체의 참조값
		OutputStream os=System.out;
		
		OutputStreamWriter osw=new OutputStreamWriter(os);
		try {
			osw.write("문자열 출력");
			//방출
			osw.flush();
			
			char[] chs= {'A','B','C','D'};
			osw.write(chs);
			osw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
