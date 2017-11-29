package test.main;

import test.dto.*;
import java.util.*;

public class MainClass05 {
	public static void main(String[] args) {
		//MemberDto type의 참조값을 담을 수 있는
		//방 3개짜리 고정 배열
		MemberDto[] members=new MemberDto[3];
		
		//MemberDto type의 참조값을 담을 수 있는 가변 배열
		ArrayList<MemberDto> members2=
				new ArrayList<MemberDto>();
		
		//아래 배열 비교하기
		int[] nums = new int[3];
		
		Integer[] nums3=new Integer[3];
		
		ArrayList<Integer> nums2=new ArrayList<Integer>();
		nums2.add(10);
		
	}
}
