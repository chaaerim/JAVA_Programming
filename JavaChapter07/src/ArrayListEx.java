import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.print("이름을 입력>>");
			String s=scanner.next();
			a.add(s);// 넣음과 동시에 방이 만들어짐. 
		}
		for(int i=0;i<a.size();i++) {
			String name=a.get(i);
			System.out.print(name+" ");
		}
		
		//가장 긴 이름 출력. 
		 int longestIndex=0;
		 for(int i=0;i<a.size();i++) {
			 if(a.get(longestIndex).length()<a.get(i).length())
				 longestIndex=i;
		 }
		 System.out.println("가장 긴 이름은: "+a.get(longestIndex));
		 scanner.close();
		
	}

}
