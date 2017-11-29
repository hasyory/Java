package example1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * MyFrame4 객체는 Component 타입도 되고 JFrame type도 되고, ActionListener 타입도 됨
 */
public class MyFrame7 extends JFrame implements ActionListener{
	//멤버 필드로 ActionListener 객체의 참조값 정의
	ActionListener listener=new ActionListener() {
		// 인터페이스 익명 클래스를 이용한 구현 및 오버라이드
		// 리스너로 등록한 객체에서 이벤트가 일어나면 호출되는 메소드
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("You clicked it!");
		}
	};
	JTextField inputNum1, inputNum2, result;
	JButton sendBtn, sendBtn2, sendBtn3, sendBtn4;
	
	//생성자
	public MyFrame7() {
		initUI();
	}
	//초기화 메소드
	public void initUI() {
		//레이아웃 설정
		setLayout(new BorderLayout());
		//패널 객체 생성
		JPanel panel=new JPanel();
		//문자열을 입력 받을 수 있는 JTextField 객체
		inputNum1=new JTextField(5);
		inputNum2=new JTextField(5);
		result = new JTextField(5);
		//전송버튼
		sendBtn=new JButton("+");
		sendBtn2=new JButton("-");
		sendBtn3=new JButton("*");
		sendBtn4=new JButton("/");
		
		sendBtn.setActionCommand("+");
		sendBtn2.setActionCommand("-");
		sendBtn3.setActionCommand("*");
		sendBtn4.setActionCommand("/");
		
		sendBtn.addActionListener(this);
		sendBtn2.addActionListener(this);
		sendBtn3.addActionListener(this);
		sendBtn4.addActionListener(this);
		
		//레이블 객체 생성
		JLabel equalLabel=new JLabel("=");
		
		//패널에 더하기
		panel.add(inputNum1);
		panel.add(sendBtn);
		panel.add(sendBtn2);
		panel.add(sendBtn3);
		panel.add(sendBtn4);
		panel.add(inputNum2);
		panel.add(equalLabel);
		panel.add(result);

		//패널을 프레임의 위 쪽에 배치(NORTH, SOUTH, EAST, WEST, CENTER)
		add(panel,BorderLayout.NORTH);
		//setBounds(x, y, width, height)
		setBounds(600, 100, 800, 500);
		//x를 눌러서 창을 닫았을 때 프로세스가 종료 되도록
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//프레임 객체가 화면에 보이도록
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame7();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int num1 = Integer.parseInt(inputNum1.getText());
		int num2 = Integer.parseInt(inputNum2.getText());
		Integer result=null;
		String who=e.getActionCommand();
		
		if(who.equals("+")) {
			result=num1+num2;
		}else if(who.equals("-")) {
			result=num1-num2;
		}else if(who.equals("*")) {
			result=num1*num2;
		}else if(who.equals("/")) {
			result=num1/num2;
		}		
		this.result.setText(result.toString());
	}
}
