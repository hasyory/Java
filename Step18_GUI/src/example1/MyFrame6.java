package example1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * MyFrame4 객체는 Component 타입도 되고 JFrame type도 되고, ActionListener 타입도 됨
 */
public class MyFrame6 extends JFrame implements ActionListener{
	//멤버 필드로 ActionListener 객체의 참조값 정의
	ActionListener listener=new ActionListener() {
		// 인터페이스 익명 클래스를 이용한 구현 및 오버라이드
		// 리스너로 등록한 객체에서 이벤트가 일어나면 호출되는 메소드
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("You clicked it!");
		}
	};
	JTextField textField, textField2;
	
	//생성자
	public MyFrame6() {
		initUI();
	}
	//초기화 메소드
	public void initUI() {
		//레이아웃 설정
		setLayout(new BorderLayout());
		//패널 객체 생성
		JPanel panel=new JPanel();
		//문자열을 입력 받을 수 있는 JTextField 객체
		textField=new JTextField(10);
		textField2=new JTextField(10);
		//전송버튼
		JButton sendBtn=new JButton("전송");
		sendBtn.addActionListener(this);
		
		//패널에 더하기
		panel.add(textField);
		panel.add(sendBtn);
		panel.add(textField2);
		
		//패널을 프레임의 위 쪽에 배치(NORTH, SOUTH, EAST, WEST, CENTER)
		add(panel,BorderLayout.NORTH);
		//setBounds(x, y, width, height)
		setBounds(600, 100, 600, 300);
		//x를 눌러서 창을 닫았을 때 프로세스가 종료 되도록
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//프레임 객체가 화면에 보이도록
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame6();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//textField 텍스트 읽어오기
		String msg = textField.getText();
		//두번째 텍스트필드에 넣어줌
		textField2.setText(msg);
		textField.setText("");
	}
}
