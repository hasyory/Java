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
public class MyFrame5 extends JFrame implements ActionListener{
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
	public MyFrame5() {
		initUI();
	}
	//초기화 메소드
	public void initUI() {
		//레이아웃 설정
		setLayout(new BorderLayout());
		//패널 객체 생성
		JPanel panel=new JPanel();
		//버튼 객체 생성
		JButton button1 = new JButton("입력");
		JButton button2 = new JButton("추가");
		JButton button3 = new JButton("삭제");
		
		//버튼에 action command 등록
		button1.setActionCommand("input");
		button2.setActionCommand("update");
		button3.setActionCommand("delete");
		
		//참조값을 비교하지않고 액션 커맨드로 비교할 수 있음
		//button1.getActionCommand();
		
		//버튼 액션 정의 
		button1.addActionListener(this);
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
		System.out.println(button1);
	}
	public static void main(String[] args) {
		new MyFrame5();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 참조값 얻어오기 
		//e.getSource()는 Object 타입을 반환하기 때문에 JButton으러 캐스팅
		//e.getSource()는 또한 Jbutton의 참조값이기도 하기 때문에 JButton으로 캐스팅이 가능하다
		System.out.println(e.getSource());
		JButton btn=(JButton)e.getSource();
		
		//버튼에 설정된 action command를 읽어온다.
		String command=btn.getActionCommand();
		
		//java에서 문자열 비교는 반드시 .equals() 를 이용해 비교
		if(command.equals("input")) {
			JOptionPane.showMessageDialog(this, "입력합니다.");
		}else if(command.equals("update")) {
			JOptionPane.showMessageDialog(this, "수정합니다.");
		}else if(command.equals("delete")) {
			JOptionPane.showMessageDialog(this, "삭제합니다.");
		}
	}
}
