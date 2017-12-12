package test.main;

import test.dto.MemberDao;
import test.dto.MemberDto;

public class MainClass12 {
	public static void main(String[] args) {
		//1번 회원 한명의 정보를 불러 오기
		MemberDao dao = MemberDao.getInstance();
		MemberDto dto = dao.forNum(999);
		
		if(dto!=null) {
			System.out.println("Num\tName\tAddr");
			System.out.println("----------------------");
			System.out.println(dto.getNum()+"\t"+dto.getName()+"\t"+dto.getAddr());
		}else {
			System.out.println("정보가 없음");
		}
	}
}
