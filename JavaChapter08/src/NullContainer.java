import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class NullContainer extends JFrame {
	public NullContainer() {
		// TODO Auto-generated constructor stub
		setTitle("�����Ӱ� ��ġ�ϴ�, ��ġ������ ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(null);//����!!!
		JLabel la=new JLabel("hello press the button");
		la.setLocation(130, 50);
		la.setSize(200,20);// ���ڿ��� ������
		contentPane.add(la);
		
		for (int i=0;i<=9;i++) {
			JButton b=new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			b.setSize(50, 20);// ��ư ũ��
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
