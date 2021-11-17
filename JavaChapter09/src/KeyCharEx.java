import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCharEx extends JFrame {
	
	JLabel la=new JLabel("엔터키로 배경색이 바뀝니다. ");
	public KeyCharEx() {
		// TODO Auto-generated constructor stub
		setTitle("키보드 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(la);
		c.addKeyListener(new MyKeyListener());//키보드만 쓰는 경우에는 이값을 꼭 붙여줘야함. 창이 여러개인데 어떤 창에 포커스를 맞출지!!
		c.setFocusable(true);
		c.requestFocus();
		setSize(250, 150);
		setVisible(true);
	}
	
	class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int r=((int)(Math.random()*256));// 랜덤으로 색 배정. 
			int g=((int)(Math.random()*256));
			int b=((int)(Math.random()*256));
			
			switch(e.getKeyChar()) {
			case '\n': //엔터 표시
				la.setText("r= "+r+", g= "+g+", b= "+b);
				getContentPane().setBackground(new Color(r, g, b));
				
				break;
			case 'q':
				System.exit(0);
			}
			super.keyPressed(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCharEx();
	}

}
