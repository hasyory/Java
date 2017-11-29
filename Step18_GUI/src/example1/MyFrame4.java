package example1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/*
 * MyFrame4 객체는 Component 타입도 되고 JFrame type도 되고, ActionListener 타입도 됨
 */
public class MyFrame4 extends JFrame implements ActionListener{
	//멤버 필드로 ActionListener 객체의 참조값 정의
	ActionListener listener=new ActionListener() {
		// 인터페이스 익명 클래스를 이용한 구현 및 오버라이드
		// 리스너로 등록한 객체에서 이벤트가 일어나면 호출되는 메소드
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("You clicked it!");
		}
	};
	//JButton button1, button2, button3;
	JButton button1=null;
	JButton button2;
	JButton button3;
	
	//생성자
	public MyFrame4() {
		initUI();
	}
	//초기화 메소드
	public void initUI() {
		//레이아웃 설정
		setLayout(new BorderLayout());
		//패널 객체 생성
		JPanel panel=new JPanel();
		//버튼 객체 생성
		this.button1 = new JButton("Click1");
		button2 = new JButton("Click2");
		button3 = new JButton("Click3");
		
		//버튼 액션 정의 
		//listener 멤버 필드:16 / this:52
		//this 생략 가능하지롱
		this.button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		//버튼을 패널에 추가
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
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
		new MyFrame4();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 참조값 얻어오기
		Object btn=e.getSource();
		String msg=null;
		if(button1==btn) {
			msg="버튼1";
		}else if(button2==btn) {
			msg="버튼2";
		}else if(button3==btn) {
			msg="버튼3";
		}
		JOptionPane.showMessageDialog(this, "안녕? "+msg);
	}
}
