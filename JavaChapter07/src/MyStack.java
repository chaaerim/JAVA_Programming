public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GStack<String> stack=new GStack<String>();
		stack.push("서울");
		stack.push("부산");
		stack.push("la");
		
		for(int n=0;n<3;n++)
			System.out.println(stack.pop());
		
		GStack<Integer> intStack=new GStack <Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for(int n=0;n<3;n++)
			System.out.println(intStack.pop());
	}

}
