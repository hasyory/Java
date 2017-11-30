package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass06 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("고양이");
		names.add("멈멈이");
		names.add("코끼리");
		names.add("기린");
		names.add("얼룩말");
		
		for(String tmp:names) {
			System.out.println(tmp);
		}
		System.out.println("-------");
		//방의 갯수만큼 반복함
		names.forEach((tmp)->{System.out.println(tmp);});
	}
}
