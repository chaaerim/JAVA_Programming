import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListEx extends JFrame{
	
	String [] fruits= {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	ImageIcon [] images= { new ImageIcon("images/icon1.png"),
			new ImageIcon("images/icon2.png"),
			new ImageIcon("images/icon3.png"),
			new ImageIcon("images/icon4.png")
			
	};
	public ListEx() {
		// TODO Auto-generated constructor stub
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strList =new JList<String>(fruits);
		c.add(strList);
		JList<ImageIcon> imageList =new JList<ImageIcon>(images);
		c.add(imageList);
		JList<String>scrollList=new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));
		
		
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListEx();

	}

}
