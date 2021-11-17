import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame{
	public LabelEx() {
		// TODO Auto-generated constructor stub
		setTitle("label ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel=new JLabel("제임스 고슬링 입니다요");
		ImageIcon img=new ImageIcon("images/gosling.jpg");
		JLabel imagelabel=new JLabel(img);
		
		ImageIcon icon =new ImageIcon("images/icon.gif");
		JLabel label=new JLabel("커피 한잔 하실레예", icon, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imagelabel);
		c.add(label);
		
		setSize(300, 500);
		setVisible(true);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx();
	}

}
