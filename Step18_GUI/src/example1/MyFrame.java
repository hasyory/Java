package example1;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//생성자
	public MyFrame() {
		//setBounds(x, y, width, height)
		//this.setBounds를 생략한 것이나 마찬가지!
		setBounds(100, 100, 300, 300);
		//x를 눌러서 창을 닫았을 때 프로세스가 종료 되도록
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//프레임 객체가 화면에 보이도록
		setVisible(true);
	}
	
	//메인 메소드
	public static void main(String[] args) {
		System.out.println("메인 시작");
		//MyFrame()객체 생성하기
		new MyFrame();
		
		System.out.println("메인 종료");
	}
}
