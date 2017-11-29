package test.mypac;

public class Emart {
	//방송
	public void broadcast(String msg) {
		System.out.println(msg);
	}
	//청소
	public void clean() {
		System.out.println("청소 해요");
	}
	public Worker getWorker() {
		return new Worker();
	}
	//내부 클래스
	public class Worker{
		//내부 클래스의 메소드
		public void work() {
			broadcast("할인 중입니다");
			clean();
		}
	}
}
