package test.main;
import test.mypac.*;
public class MainClass02 {
	public static void main(String[] args) {
		usePrint(new printMsg() {
			@Override
			public void printMsg(String msg) {
				System.out.println("출력: "+msg);
			}
		});
		//인자는 이미 String 타입으로 선언 되어있기때문에 생략 가능
		usePrint((msg)->{
			System.out.println("출력2: "+msg);
		});
	}
	public static void usePrint(printMsg p) {
		p.printMsg("Hello");
	}
}
