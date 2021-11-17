import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonImageEx extends JFrame{
	public ButtonImageEx() {
		// TODO Auto-generated constructor stub
		setTitle("�̹��� ��ư ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon=new ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverIcon=new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedIcon=new ImageIcon("images/pressedIcon.gif");
		
		JButton btn=new JButton("call...", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		
		c.add(btn);
		setSize(250, 150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonImageEx();
	}

}
