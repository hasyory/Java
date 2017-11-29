package test.main;
import test.mypac.*;

public class MainClass07 {
	public static void main(String[] args) {
		//Pen type 객체를 담을 수 있는 방 3개짜리 배열 객체 생성
		Pen[] pens= new Pen[3];
		
		pens[0]=new Pen("Red");
		pens[1]=new Pen("Green");
		pens[2]=new Pen("Blue");
		
		//반복문 이용해서 배열에 저장된 모든 Pen 객체의
		//write() 메소드와 draw() 메소드를 호출하기
		
		//index가 필요하지 않을 때 확장 for 문 이용하면 됨
		System.out.println("---- 확장 for 문 ----");
		for(Pen tmp:pens){
			tmp.write().draw();
		}
		/*
		 * for(int i=0; i<pens.length; i++){
		 * 	Pen tmp=pens[i];
		 * 	tmp.write();
		 * 	tmp.draw();
		 * }
		 */
	}
}
