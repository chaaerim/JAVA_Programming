import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboActionEx extends JFrame{
	
	String [] fruits= {"apple", "banana", "mango"};
	ImageIcon[] images= {
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/mango.jpg")
	};
	
	JLabel imageLabel=new JLabel(images[0]);
	public ComboActionEx() {
		// TODO Auto-generated constructor stub
		setTitle("콤보박스 활용 예제");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> combo=new JComboBox<String>(fruits);
		c.add(combo);
		c.add(imageLabel);
		
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JComboBox<String> cb=(JComboBox<String>)e.getSource();
				int index=cb.getSelectedIndex();
				imageLabel.setIcon(images[index]);
			}
		});
		
		setSize(300, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboActionEx();
	}

}
