import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame {
	
	JLabel la=new JLabel("hello");
	public FlyingTextEx() {
		// TODO Auto-generated constructor stub
		setTitle("텍스트 날아라");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		la.setSize(50, 50);
		la.setLocation(100, 20);
		c.add(la);
		setSize(200, 200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int Keycode=e.getKeyCode();// 유니코드가 아니므로 숫자로 받아와야함
			switch(Keycode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY()-10);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY()+10);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-10, la.getY());
				break;	
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+10, la.getY());
				break;
			default:
				break;
			}
			super.keyPressed(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();
	}

}
