package test.main;
import test.mypac.*;
public class MainClass03 {
	public static void main(String[] args) {
		useRemocon(()->{
			System.out.println("켜졌다");
		});
		useRemocon(()->{
			System.out.println("꺼졌다");
		});
		useRemocon(()->{
			System.out.println("소리를 줄였다");
		});
	}
	public static void useRemocon(Remocon r) {
		r.turnOn();
	}
}

