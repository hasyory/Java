package test.mypac;

public class YourRemocon implements Remocon {

	@Override
	public void up() {
		System.out.println("볼륨 +1");
	}

	@Override
	public void down() {
		System.out.println("볼륨 -1");
	}
	
}
