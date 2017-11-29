package test.main;
import test.armory.*;
public class MainClass09 {
	public static void main(String[] args) {
		Gun g1=new Gun(new Bullet());
		g1.fire();
		
		Gun g2=new Gun(null);
		g2.fire();
	}
}
