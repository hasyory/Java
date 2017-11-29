package test.mypac;

public class Bed {
	public String name;
	
	public Bed(String name) {
		this.name=name;
	}
	
	public void whosBed() {
		System.out.println(this.name+"의 푹신한 침대가 준비되었습니다.");
	}
}
