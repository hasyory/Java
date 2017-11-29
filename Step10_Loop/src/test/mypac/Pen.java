package test.mypac;

public class Pen {
	public String color;
	
	public Pen(String color) {
		this.color=color;
	}
	public Pen write() {
		System.out.println(color+"색 Pen으로 필기해요!");
		return this;
	}
	public Pen draw() {
		System.out.println(color+"색 Pen으로 그림 그려요!");
		return this;
	}
}
