package example1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame{
	//멤버 필드로 ActionListener 객체의 참조값 정의
	ActionListener listener=new ActionListener() {
		// 인터페이스 익명 클래스를 이용한 구현 및 오버라이드
		// 리스너로 등록한 객체에서 이벤트가 일어나면 호출되는 메소드
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("You clicked it!");
		}
	};
	
	//생성자
	public MyFrame2() {
		initUI();
	}
	//초기화 메소드
	public void initUI() {
		//레이아웃 설정
		setLayout(new BorderLayout());
		//패널 객체 생성
		JPanel panel=new JPanel();
		//버튼 객체 생성
		JButton button = new JButton("Click");
		//버튼 액션 정의 
		//listener 멤버 필드:16
		//addActionListener는  actionPerformed라는 메소드르 호출함
		button.addActionListener(listener);
		//버튼을 패널에 추가
		panel.add(button);
		//패널을 프레임의 위 쪽에 배치(NORTH, SOUTH, EAST, WEST, CENTER)
		add(panel,BorderLayout.NORTH);
		
		//setBounds(x, y, width, height)
		setBounds(600, 100, 300, 300);
		//x를 눌러서 창을 닫았을 때 프로세스가 종료 되도록
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//프레임 객체가 화면에 보이도록
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame2();
	}

}
