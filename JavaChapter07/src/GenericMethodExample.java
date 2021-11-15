import java.util.*;
public class GenericMethodExample {
	static<T> GStack<T> reverse(GStack<T> a){
		GStack<T> s=new GStack<>();
		while(true) {
			T tmp;
			tmp=a.pop();
			if(tmp==null)// 스택이 비어있다는 뜻. 
				break;
			else
				s.push(tmp);// 거꾸로 뽑아서 새 스택에 집어넣음. 
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
