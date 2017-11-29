package test.main;

import test.mypac.*;

public class MainClass02 {
	public static void main(String[] args) {
		//MyUtil getNum() 호출
		int getNum1 = MyUtil.getNum();
		System.out.println(getNum1);
		
		//MyUtil getMessage() 호출 후 msg에 저장.
		String msg = MyUtil.getMessage();
		System.out.println(msg);
		
		//MyUtil getName() 호출 후 name에 저장
		String name = new MyUtil().getName();
		System.out.println(name);
	}
}
