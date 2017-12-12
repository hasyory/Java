package test.main;

import test.dto.MemberDao;
import test.dto.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		/*//MemberDao 객체의 insert() 메소드를 호출하려면?
		 //new MemberDao() 는 할 수 없음. 생성자의 접근지정자를 private로 선언했기 때문이쥐
		MemberDao dao1 = MemberDao.getInstance();
		dao1.insert();
		//MemberDao 객체의 delete() 메소드를 호출하려면?
		//여기는 다른 부분이라고 가정
		MemberDao dao2 = MemberDao.getInstance();
		dao2.delete();
		
		if(dao1==dao2) {
			System.out.println("dao1 과 dao2는 같다");
		}
		*/
		
		//아래의 저오를 DB에 저장하려면?
		int num=999;
		String name ="누구";
		String addr ="어디";
		
		MemberDao dao = MemberDao.getInstance();
		MemberDto dto = new MemberDto(num,name,addr);
		
		boolean isSuccess = dao.insert(dto);
		if(isSuccess) {
			System.out.println("저장 성공");
		}else {
			System.out.println("저장 실패");
		}
		System.out.println("메인 종료");
	}
}
