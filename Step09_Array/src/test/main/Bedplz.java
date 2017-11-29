package test.main;

import java.util.Scanner;

import test.mypac.*;

public class Bedplz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("졸리나요?");
		String anss=scan.next();
		
		Bed[] bed1= {new Bed("하쇼리"), new Bed("하경이")};
		boolean isSame=anss.equals("YES") || anss.equals("Y") || anss.equals("yes") || anss.equals("y") || anss.equals("ㅇㅇ");
		
		if (isSame) {
		bed1[0].whosBed();
		bed1[1].whosBed();
		}
	}
}
