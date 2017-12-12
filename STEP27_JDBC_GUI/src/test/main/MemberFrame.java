package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame implements ActionListener{
	//맴버필드 정의하기
	JTextField inputNum, inputName, inputAddr;
	JButton saveBtn, deleteBtn, updateBtn, queryBtn;
	MemberDao dao = MemberDao.getInstance();
	DefaultTableModel model;
	boolean isTwice=false;
	
	//생성자
	public MemberFrame() {
		System.out.println("MemberFrame() 생성자 시작");
		initUI();
		System.out.println("MemberFrame() 생성자 종료");
	}
	//초기화 메소드
	public void initUI() {
		System.out.println("initUI() 메소드 시작");
		//레이아웃 설정
		setLayout(new BorderLayout());
		//상단 페널 객체 생성
		JPanel topPanel=new JPanel();
		
		//레이블 객체 생성
		JLabel label1=new JLabel("번호");
		JLabel label2=new JLabel("이름");
		JLabel label3=new JLabel("주소");
		
		//텍스트 필드 객체 생성
		inputNum=new JTextField(10);
		inputName=new JTextField(10);
		inputAddr=new JTextField(10);
		
		saveBtn=new JButton("저장");
		deleteBtn=new JButton("삭제");
		updateBtn=new JButton("수정");
		queryBtn=new JButton("불러오기");
		
		saveBtn.setActionCommand("save");
		deleteBtn.setActionCommand("del");
		updateBtn.setActionCommand("mod");
		queryBtn.setActionCommand("qry");
		
		saveBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		queryBtn.addActionListener(this);
		
		inputNum.setEditable(false);
		
		//페널에 컴포넌트 추가 하기 
		topPanel.add(label1);
		topPanel.add(inputNum);
		topPanel.add(label2);
		topPanel.add(inputName);
		topPanel.add(label3);
		topPanel.add(inputAddr);
		topPanel.add(saveBtn);
		topPanel.add(deleteBtn);
		topPanel.add(updateBtn);
		topPanel.add(queryBtn);
		
		//프레임의 상단에 페널 배치하기
		add(topPanel, BorderLayout.NORTH);
		
		//테이블 컬럼 열을 String[]에 담음
		String[] colNames = {"번호","이름","주소"};
		//기본 테이블 모델 객체 생성
		model = new DefaultTableModel(colNames, 0);
		JTable table=new JTable();
		table.setModel(model);
		
		//스크롤 가능한 패널 객체, 창 이상으로 넘어가면 스크롤바가 생김
		JScrollPane sPanel=new JScrollPane(table);
		//레이아웃 배치
		add(sPanel, BorderLayout.CENTER);
		//setBounds(x, y, width, height)
		setBounds(600, 100, 800, 500);
		//x를 눌러서 창을 닫았을 때 프로세스가 종료 되도록
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//프레임 객체가 화면에 보이도록
		setVisible(true);
		
		System.out.println("initUI() 메소드 종료");
	}
	
	//메인 메소드
	public static void main(String[] args) {
		System.out.println("시작");
		new MemberFrame();
		System.out.println("종료");
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		String command=ae.getActionCommand();
		if(command.equals("save")) {
			String name=inputName.getText();
			String addr=inputAddr.getText();
			//MemberDto dto = new MemberDto(0,name,addr);
			MemberDto dto = new MemberDto();
			dto.setName(name);
			dto.setAddr(addr);

			boolean isSuccess = dao.insert(dto);
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "저장 완료!");
			}else {
				JOptionPane.showMessageDialog(this, "저장 실패!");
			}
		}else if(command.equals("del")) {
			if(isTwice) {
				int num=Integer.parseInt(inputNum.getText());
				boolean isSuccess = dao.delete(num);
				
				if(isSuccess) {
					JOptionPane.showMessageDialog(this, "삭제 완료!");
				}else {
					JOptionPane.showMessageDialog(this, "삭제 실패!");
				}
	
				inputNum.setEditable(false);
				inputName.setEditable(true);
				inputAddr.setEditable(true);
				isTwice=false;
			}else {
				inputNum.setEditable(true);
				inputName.setEditable(false);
				inputAddr.setEditable(false);
				isTwice=true;
			}
		}else if(command.equals("mod")) {
			if(isTwice) {
				int num=Integer.parseInt(inputNum.getText());
				String name=inputName.getText();
				String addr=inputAddr.getText();
				
				boolean isSuccess = dao.update(new MemberDto(num,name,addr));
				if(isSuccess) {
					JOptionPane.showMessageDialog(this, "수정 완료!");
				}else {
					JOptionPane.showMessageDialog(this, "수정 실패!");
				}
				inputNum.setEditable(false);
				isTwice=false;
			}else {
				inputNum.setEditable(true);
				isTwice=true;
			}
		}else if(command.equals("qry")) {
			displayMember();
		}
		//버튼 동작 후 모든 입력 칸 비움
		inputNum.setText("");
		inputName.setText("");
		inputAddr.setText("");
		displayMember();
	}
	//DB에 있는 회원정보를 JTable에 출력하는 메소드
	public void displayMember() {
		//회원 정보를 얻어온다.
		List<MemberDto> list = dao.getList();
		//테이블의 내용을 지움.  행을 모두 날려버림!
		model.setRowCount(0);
		//다시 출력
		for(MemberDto tmp:list) {
			Object[] rowData= {tmp.getNum(),tmp.getName(),tmp.getAddr()};
			model.addRow(rowData);
		}
	}
}
