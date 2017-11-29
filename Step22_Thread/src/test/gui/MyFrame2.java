package test.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame 
						implements ActionListener{
	int count=0;
	//생성자 
	public MyFrame2() {
		initUI();
	}
	//초기화 메소드
	public void initUI() {
		//레이아웃 설정
		setLayout(new BorderLayout());
		//페널 객체 생성
		JPanel panel=new JPanel();
		//버튼 객체 생성
		JButton button=new JButton("알림띄우기");
		JButton downBtn=new JButton("다운로드");
		//버튼에 ActionListener 등록하기 
		button.addActionListener(this);
		button.setActionCommand("alert");
		
		downBtn.addActionListener(this);
		downBtn.setActionCommand("download");
		
		//버튼을 페널에 추가
		panel.add(button);
		panel.add(downBtn);
		//페널을 프레임의 위쪽(북쪽) 에 배치
		add(panel, BorderLayout.NORTH);
		
		// setBounds(x, y, width, height)
		setBounds(100, 100, 500, 500);
		// x 를 눌러서 창을 닫았을때 프로세스가 종료 되도록
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 프레임 객체가 화면에 보이도록 
		setVisible(true);
	}
	//메인 메소드 
	public static void main(String[] args) {
		new MyFrame2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 action command 를 읽어온다.
		String command=e.getActionCommand();
		if(command.equals("alert")) {
			JOptionPane.showMessageDialog(this, "알림!");
		}else if(command.equals("download")) {
			//시간이 오래걸릴 
			new Thread() {
				@Override
				public void run() {
					count++;
					int curnum=count;
					System.out.println(count+". 다운로드 시작");
					try {
						System.out.println(curnum+". 다운로드 중");
						Thread.sleep(10000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					System.out.println(curnum+". 다운로드 완료");
				}
			}.start();
		}
	}
}