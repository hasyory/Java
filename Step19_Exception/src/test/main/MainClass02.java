package test.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass02 {
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
		}catch(InputMismatchException ime) {
			//InputMismatchException 형 예외가 발생하면 실행되는 블럭
			//ime.printStackTrace();
			System.out.println("정수형 숫자로 입력하세요.");
		}catch(ArithmeticException ie) {
			//ArithmeticException 형 예외가 발생하면 실행되는 블럭
			//ie.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(Exception e) {
			//그 외 예외가 발생하면 실행되는 블럭
			System.out.println("!!EXCEPTION!!");
			System.out.println("예외 정보: "+e.getMessage());
			e.printStackTrace();
		}finally {
			//예외가 발생하던 안하던 반드시 실행이 보장되는 블럭
			//어떤 예외가 발생하더라도 반드시 실행되어야 하는 부분
			System.out.println("마무리 작업 중");
		}

		System.out.println("메인 종료");
	}
}
