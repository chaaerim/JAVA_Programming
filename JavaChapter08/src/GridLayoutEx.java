import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame{
	public GridLayoutEx() {
		setTitle("처음 만들어 보는 그리드 레이아웃");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(new GridLayout());
		
		for(int i=0; i<10;i++) {
			String text=Integer.toString(i);
			JButton button=new JButton(text);
			contentPane.add(button);
			
		}
		setSize(500, 200);
		setVisible(true);
	// TODO Auto-generated constructor stub
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx();
	}

}
