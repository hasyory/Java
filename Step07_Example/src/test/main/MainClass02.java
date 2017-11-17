package test.main;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드 시작");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");		
		String msg = scan.nextLine();
		
		System.out.println("msg: "+msg);
		System.out.println("main 메소드 종료");
	}
}
