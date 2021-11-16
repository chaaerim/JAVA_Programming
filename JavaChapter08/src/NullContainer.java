import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class NullContainer extends JFrame {
	public NullContainer() {
		// TODO Auto-generated constructor stub
		setTitle("자유롭게 배치하는, 배치관리자 없는 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(null);//주의!!!
		JLabel la=new JLabel("hello press the button");
		la.setLocation(130, 50);
		la.setSize(200,20);// 문자열의 사이즈
		contentPane.add(la);
		
		for (int i=0;i<=9;i++) {
			JButton b=new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			b.setSize(50, 20);// 버튼 크기
			contentPane.add(b);
		}
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullContainer();
	}

}
