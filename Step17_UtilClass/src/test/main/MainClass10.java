package test.main;
/*
 * [HashSet]
 * -순서가 없다
 * -중복을 허용하지 않는다
 * -집합의 개념으로 데이터를 관리하고 싶을 때 사용한다.
 */
import java.util.HashSet;
import java.util.Iterator;

public class MainClass10 {
	public static void main(String[] args) {
		//Hashset 객체 생성해서 참조값을 변수에 담기
		HashSet<Integer> nums=new HashSet<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		nums.add(50);
		nums.add(50);
		nums.add(40);
		
		//Set에 들어있는 데이터의 갯수 참조
		int size=nums.size();
		
		//반복자 객체 리턴 받기
		Iterator<Integer> it=nums.iterator();
		while(it.hasNext()) {
			int tmp=it.next();
			//콘솔에 출력해보기
			System.out.println(tmp);
		}
		
	}
}
