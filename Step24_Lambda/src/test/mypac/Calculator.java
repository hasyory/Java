package test.mypac;

// 메소드를 추가하면 한대 맞기 때문에 아래와 같이 명시해준다
@FunctionalInterface
public interface Calculator {
	public int calc(int num1, int num2);
}
