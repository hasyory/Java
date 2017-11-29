package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass01 {
	public static void main(String[] args) {
		String path="C:/myFolder/myMemo.txt";
		//경로 정보를 가지고 있는 문자열을 생성자의 인자로 전달
		//File 객체 생성하기
		File file=new File(path);
		
		if(file.exists()) {
			if(file.isDirectory()) {
				System.out.println(path+" is a directory");
			}else {
				System.out.println(path+" is a file");
			}
			file.delete();
			System.out.println("삭제했습니다.");
		}else {
			System.out.println(path+"는 존재하지 않습니다.");
			file.mkdir();
			System.out.println(path+"를 생성했습니다.");
		}
	}
}
