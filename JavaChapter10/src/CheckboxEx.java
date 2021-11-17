import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckboxEx extends JFrame{
		JCheckBox[]fruits=new JCheckBox[3];
		String[]names={"사과", "체리", "배"};
		JLabel sum;
		
	public CheckboxEx() {
		// TODO Auto-generated constructor stub
		setTitle("checkbox ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("사과 100원, 배 500원, 체리 2000원"));
		MyItemListener listener =new MyItemListener();
		for(int i=0;i<fruits.length;i++) {
			fruits[i]=new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
			
		}
		sum=new JLabel("현재 0원입니다");
		c.add(sum);
	
		setSize(250, 150);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		int sum1=0;
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			// 아이템이 눌려지면.. 
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem()==fruits[0])
					sum1+=100;
				else if(e.getItem()==fruits[1])
					sum1+=500;
				else
					sum1+=2000;
			}
			else {
				if(e.getItem()==fruits[0])
					sum1-=100;
				else if(e.getItem()==fruits[1])
					sum1-=500;
				else
					sum1-=2000;
			}
			sum.setText("현재"+sum1+"입니다. ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckboxEx();
	}

}
