package test.main;

import test.mypac.*;

public class MainClass04 {
	public static void main (String[] args) {
		//MyUtil printMsg() 메소드 호출.
		//지역변수는 메소드가 호출 됬을 때 생성되고, 메소드가 리턴되면 삭제됨.
		MyUtil.printMsg("받아라 메시지!");
	}
}
