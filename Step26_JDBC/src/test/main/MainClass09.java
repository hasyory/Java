package test.main;

import test.dto.MemberDao;
import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		//수정할 회원정보
		
		int num=999;
		String name="에이콘";
		String addr="종로";
		
		MemberDao dao = MemberDao.getInstance();
		MemberDto dto = new MemberDto(num,name,addr);
		boolean isSuccess = dao.update(dto);
		if(isSuccess) {
			System.out.println("수정 완료.");
		}else {
			System.out.println("수정 실패.");
		}
	}
}
