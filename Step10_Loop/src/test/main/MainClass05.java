package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50};
		
		for(short i=0; i<nums.length; i++) {
			//변수 tmp는 i++을 수행할 때 사라짐. 생성-삭제를 for문 안에서 반복함
			int tmp = nums[i];
			System.out.println(tmp);
		}
		
		System.out.println("----------------");
		/*
		  for(short i=0; i<nums.length; i++) {
			int tmp = nums[i];
			를 줄여서 for(int tmp:nums){}로 쓸수 있음
		 */
		for(int tmp:nums) {
			System.out.println(tmp);
		}

	}
}
