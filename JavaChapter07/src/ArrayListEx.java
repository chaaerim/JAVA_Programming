import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.print("�̸��� �Է�>>");
			String s=scanner.next();
			a.add(s);// ������ ���ÿ� ���� �������. 
		}
		for(int i=0;i<a.size();i++) {
			String name=a.get(i);
			System.out.print(name+" ");
		}
		
		//���� �� �̸� ���. 
		 int longestIndex=0;
		 for(int i=0;i<a.size();i++) {
			 if(a.get(longestIndex).length()<a.get(i).length())
				 longestIndex=i;
		 }
		 System.out.println("���� �� �̸���: "+a.get(longestIndex));
		 scanner.close();
		
	}

}
