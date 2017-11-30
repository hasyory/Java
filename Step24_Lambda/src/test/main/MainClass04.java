package test.main;

import test.mypac.Calculator;

public class MainClass04 {
	public static void main(String[] args) {
		
		Calculator add=(int num1, int num2)->num1+num2;
		
		Calculator add2=(int num1, int num2)->{return num1+num2;};
		
		Calculator add3=new Calculator() {
			@Override
			public int calc(int num1, int num2) {
				return num1+num2;
			}
		};
				
		int result = add.calc(10, 20);
		int result2 = add2.calc(30, 40);
		int result3 = add3.calc(50, 60);
		
		System.out.println("result: "+result);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
	}
}
