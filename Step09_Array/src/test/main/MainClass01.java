package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		/*
		 * 배열의 제약 사항
		 * 한가지 타입만으로 가능
		 * 배열 자체도 키값임
		 * 배열 각 방에는 참조값이 담김
		 * 한번 만들어진 방의 갯수는 줄이거나 늘일수 없음
		 * 
		 * 그래서 배열을 만들 땐
		 * 타입과 길이를 고려해야함
		 * 
		 * 생성 방법
		 * 배열도 참조값인 객체기 때문에
		 * new 타입[길이]
		 * 
		 * int[] a=new int[3];
		 */
		//int 타입을 저장할 수 있는 방 3개 배열
		int[] nums=new int[3];
		
		//double 타입을 저장할 수 있는 방 5개 배열
		double[] dobs=new double[3];
		
		String[] strs=new String[3];
	}
}
