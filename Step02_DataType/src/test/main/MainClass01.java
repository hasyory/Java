package test.main;
/*
 *  	[ Java 기본 데이터 type ] vs 참조 데이터 type
 *  		기본 데이터 : 값이 들어있음, 소문자로 시작
 *  		참조 데이터 : 참조값(reference 값)이 들어있음, 대문자로 시작
 *  	
 *  	1. 숫자형
 *  	
 *  	- 정수형 : byte, short, int, long
 *  
 *  		- byte 변수명; // -128 ~ 127
 *  		- short 변수명; // -32768 ~ 32767
 *  		- int 변수명; // -2147483648 ~ 2147483647
 *  		- long 변수명; // -9223372036854775808 ~ 9223372036854775807
 *  
 *  	- 실수형 : float, double
 *  
 *  		- float 변수형; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38	
 *  		- double 변수형; // 4.94065645841246544e-324d ~ 1.79769313486231570e+308d		
 * 
 * 		byte, int, double이 제일 많이 쓰인다.
 * */
 
public class MainClass01 {
	//  실행순서가 시작되는 특별한 main 메소드
	public static void main(String[] args) {
		byte iByte = 10;
		short iShort = 10;
		int iInt = 10;
		long iLong = 10;
		
		int tmp = iByte; // 더 큰 그릇에 담았기 때문에 오류가 발생하지 않음
		// byte tmp = iInt; 더 작은 그릇에 담았기 때문에 오류 발생
		// casting 연산자(형변환 연산자)를 이용하기, int type이지만 byte type이라고 강제로 지정
		byte tmp2 = (byte)iInt;
		
		// 실수형 변수 종류별로 선언하고 값 대입하기
		float num1 = 10.1f;
		double num2 = 10.1d;
		double num3 = 10.1; // d를 생략하면  double type이다.
		
		// float type을 double type으로 담기 (가능)
		double tmp3 = num1;
		
		// casting 연산자를 이용해서 double type을 float type으로 강제 변경
		float tmp4 = (float)num2;
	}
}