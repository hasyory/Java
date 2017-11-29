package test.main;

import java.util.Scanner;
//RuntimeException은 실행 시 발생하는 예외이고 Exception은 컴파일 시 발생하는 예외 
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("갯 수 입력: ");
			int num1=scan.nextInt();
			System.out.print("피갯 수 입력: ");
			int num2=scan.nextInt();
			
			int mog=num2/num1;
			int na=num2%num1;
			
			System.out.println(num2+"/"+num1+" 몫: "+mog);
			System.out.println(num2+"/"+num1+" 나머지: "+na);
		}catch(Exception e) {
			System.out.println("!!EXCEPTION!!");
			System.out.println("예외 정보: "+e.getMessage());
			e.printStackTrace();
		}		

		System.out.println("메인 종료");
	}
}
