package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass03 {
	public static void main(String[] args) throws IOException {
		String path="C:/";
		File file=new File(path);
		//list() 메소드를 이용해서 디렉토리와 파일목록 String[] 로 얻어옴
		String[] lists = file.list();
		
		for(String tmp:lists) {
			System.out.println(tmp);
		}
		System.out.println("------");
		//디렉토리 혹은 파일에 접근 할 수 있는 File 객체가 담겨있는 File[] 얻기
		File[] files = file.listFiles();
		for(File tmp:files) {
			String name=tmp.getName();
			if(tmp.isDirectory()) {
				System.out.println(name+"/");
			}else {
				System.out.println(name);
			}
		}
	}
}
