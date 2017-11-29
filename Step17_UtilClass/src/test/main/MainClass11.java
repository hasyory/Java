package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Random;

public class MainClass11 {
	public static void main(String[] args) {
		Set<Integer> lottoNums=new HashSet<Integer>();
		
		Random ran = new Random();
		
		while(true) {
			// 1 ~ 45 사이의 랜덤한 정수를 얻어낸다.
			int num=ran.nextInt(45)+1;
			//Set에 저장
			lottoNums.add(num);
			//Set에 6개가 저장되면 반복문 탈출
			if(lottoNums.size()==6) {
				break;
			}
		}
		
//		Iterator<Integer> it=lottoNums.iterator();
//		while(it.hasNext()) {
//			int tmp=it.next();
//			//콘솔에 출력해보기
//			System.out.println(tmp);
//		}
		
		//Set을 List로 변환
		List<Integer> nums=new ArrayList<>(lottoNums);
		//정렬
		Collections.sort(nums);
		//출력
		for(int tmp:nums) {
			System.out.println(tmp);
		}
	}
}
