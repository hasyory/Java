package test.main;

import java.util.List;

import test.dto.MemberDao;
import test.dto.MemberDto;

public class MainClass11 {
	public static void main(String[] args) {
		MemberDao dao = MemberDao.getInstance();
		List<MemberDto> dtoList = dao.getList();
		
		System.out.println("Num\tName\tAddr");
		System.out.println("----------------------");
		for(MemberDto tmp:dtoList) {
			System.out.println(tmp.getNum()+"\t"+tmp.getName()+"\t"+tmp.getAddr());
		}
	}
}
