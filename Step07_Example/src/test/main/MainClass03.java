package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran=new Random();
		
		int partnerNum=ran.nextInt(3);
		System.out.println("가위(0), 바위(1), 보=(2) 입력: ");
		int inputNum=scan.nextInt();
		
		if(inputNum>3) {
			System.out.println("다시 입력 해");
			return;
		}
		
		System.out.println("나: "+inputNum);
		System.out.println("너: "+partnerNum);
		
		if(inputNum==partnerNum) {
			System.out.println("비겼다");
		}
		if(inputNum-partnerNum<0) {
			System.out.println("졌다");
		}
		if(inputNum-partnerNum>0) {
			System.out.println("이겨따");
		}
		
		
//		if(inputNum==0){
//			if(partnerNum==0) {
//				System.out.println("난 가위, 비김");
//			}
//			if(partnerNum==1) {
//				System.out.println("난 바위, 너 짐");
//			}
//			if(partnerNum==2) {
//				System.out.println("난 보, 너 이김");
//			}
//		}
//		else if(inputNum==1) {
//			if(partnerNum==0) {
//				System.out.println("난 가위, 너 이김");
//			}
//			if(partnerNum==1) {
//				System.out.println("난 바위, 비김");
//			}
//			if(partnerNum==2) {
//				System.out.println("난 보, 너 짐");
//			}
//		}else if(inputNum==2) {
//			if(partnerNum==0) {
//				System.out.println("난 가위, 너 이김");
//			}
//			if(partnerNum==1) {
//				System.out.println("난 바위, 너 짐");
//			}
//			if(partnerNum==2) {
//				System.out.println("난 보, 비김");
//			}
//		}
		
		System.out.println(inputNum);
	}		
}
	
