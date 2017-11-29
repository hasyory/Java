package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		File file=new File("c:/myFolder/myMemo.txt");
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(file);
			//BufferedReader객체 생성
			br = new BufferedReader(fr);
			//반복문 돌면서 한줄씩 읽어들인다
			while(true) {
				String line=br.readLine();
				if(line==null) {
					//읽어들인 줄이 null이면
					break; //반복문 탈출!
				}
				//읽은 내용 콘솔에 출력
				System.out.println(line);
			}		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			//마무리 작업!
			try {
				//null point exception 방지, if문 블럭 한줄 일 땐 {} 안써도 됨
				if(br!=null)br.close();
				if(fr!=null)fr.close();
			} catch (IOException e) {}
		}
		System.out.println("메인 종료");
	}
}
