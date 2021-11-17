import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame{
	public JComponentEx() {
		// TODO Auto-generated constructor stub
		super("jcomponent의 메소드 예제");
		Container c=getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());
		JButton b1=new JButton("Megenta/Yellow");
		JButton b2=new JButton("    disable button	");
		JButton b3=new JButton("getX(), getY()");
		
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.MAGENTA);
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		b2.setEnabled(false);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b=(JButton)e.getSource();
				setTitle(b.getX()+", "+b.getY());
				
			}
		});
		
		c.add(b1);// 만든 버튼 붙이기 
		c.add(b2);
		c.add(b3);
		setSize(260, 200);// 바닥판 사이즈
		setVisible(true);// 보이게 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComponentEx();
	}

}
