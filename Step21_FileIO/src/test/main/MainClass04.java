package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		String path="c:/myFolder/myMemo.txt";
		File file=new File(path);
		try {
			FileWriter fw=new FileWriter(file);
			fw.write("안녕 안녕~?\r\n");
			fw.write("루쓔");
			fw.flush();
			fw.close();
			System.out.println("myMemo.txt에 문자열 출력함");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("메인 종료");
	}
}
