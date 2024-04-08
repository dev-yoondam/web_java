package gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class BtnTest extends JFrame{
	public BtnTest() {
		setTitle("타이틀 입니다.");
		setSize(350, 500);
		
		setLocationRelativeTo(null);	//화면 중앙
		setResizable(true);	//사이즈 조절 불가
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("닫기");
				System.exit(0);
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		new BtnTest();
	}
}
















