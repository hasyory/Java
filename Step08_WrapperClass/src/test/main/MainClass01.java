package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		//기본 데이터 타입
		byte num1=10;
		
		//참조 데이터 타입
		//기본 데이터 타입에 참조 데이터 타입이 존재함?!
		Byte num2=10;
		
		short num3=11;
		Short num4=100;
		
		int num5=999;
		Integer num6=1000;
		
		//기본적으로 int형으로 맞춰지기 때문에 l을 붙여서 long형임을 선언
		long num7=888l;
		Long num8=777l;
		
		//기본적으로 double형으로 맞춰지기 때문에 f를 붙여서 float형임을 선언
		float num9=10.1f;
		Float num10=10.3f;
		
		double num11=10.2;
		Double num12=10.4;
		
		char ch1='가';
		Character ch2='나';
		
		boolean isA=true;
		Boolean isB=false;
		
		
		System.out.println("메인 종료");
	}
}
