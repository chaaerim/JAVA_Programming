import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("�Լ��� ��ư 3�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// JFrame�� ����� ���� ���Ѷ�. 
		
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.ORANGE);
		
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("ok"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);// ���ϸ� �Ⱥ���!!
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
