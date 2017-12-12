package test.main;

import java.util.List;
import java.util.Scanner;

import test.dto.MemberDao;
import test.dto.MemberDto;

public class DaoTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberDao dao = MemberDao.getInstance();
		boolean isEnd = true;
		
		System.out.println("테스트를 시작합니다.");
		while(isEnd) {
			System.out.println("1. SELECT ALL\t2. INSERT\t3. DELETE\t4. UPDATE\t5. END");
			System.out.print("선택: ");
			byte opt1=scan.nextByte();
			if(opt1==1) {
				printList(dao.getList());
			}else if(opt1==2) {
				System.out.println("INSERT 과정을 시작합니다.");
				dao.insert(getDto());
			}else if(opt1==3) {
				System.out.print("삭제할 테이블 로우: ");
				dao.delete(scan.nextInt());
			}else if(opt1==4) {
				System.out.println("UPDATE 과정을 시작합니다.");
				dao.update(getDto());
			}else if(opt1==5) {
				isEnd=false;
				System.out.println("테스트를 종료합니다.");
			}
		}

	}
	static void printList(List<MemberDto> dtoList) {
		System.out.println("Num\tName\tAddr");
		System.out.println("----------------------");
		for(MemberDto tmp:dtoList) {
			System.out.println(tmp.getNum()+"\t"+tmp.getName()+"\t"+tmp.getAddr());
		}
	}
	static MemberDto getDto() {
		Scanner scan = new Scanner(System.in);
		System.out.println("num? ");
		int inputNum = scan.nextInt();
		System.out.println("name? ");
		String inputName = scan.next();
		System.out.println("addr? ");
		String inputAddr = scan.next();
		
		return new MemberDto(inputNum,inputName,inputAddr);
	}
}
