import java.util.*;
public class GenericMethodExample {
	static<T> GStack<T> reverse(GStack<T> a){
		GStack<T> s=new GStack<>();
		while(true) {
			T tmp;
			tmp=a.pop();
			if(tmp==null)// ������ ����ִٴ� ��. 
				break;
			else
				s.push(tmp);// �Ųٷ� �̾Ƽ� �� ���ÿ� �������. 
		}
			return s;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GStack<Double> gs=new GStack<Double>();
		for(int i=0;i<5;i++) {
			gs.push(new Double(i));
		}
		gs=reverse(gs);
		for(int i=0;i<5;i++) {
			System.out.println(gs.pop());
		}

	}

}
