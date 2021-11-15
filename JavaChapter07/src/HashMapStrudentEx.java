import java.util.*;

class Student{
	private int id;
	private String tel;
	public Student(int id, String tel) {
		this.id=id;
		this.tel=tel;
	}
	public int getId() {// private에 접근하지 못하므로 간접접근 할 수 있도록 함수 생성
		return id;
	}
	public String getTel() {
		return tel;
	}
}
public class HashMapStrudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 만드는 순서 1. 이름, 2. 방, 3. 방의 내용
		HashMap<String, Student> map=new HashMap<String, Student>();
		map.put("황기태", new Student(1, "010-1111-1111"));
		map.put("이재문", new Student(2, "010-2222-2222"));
		map.put("김남윤", new Student(3, "010-3333-3333"));
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름 ");
			String name=scanner.nextLine();
			if(name.equals("exit"))
				break;
			Student student=map.get(name);
			if(student == null)
				System.out.println(name+"은 없는 사람입니다. ");
			else 
				System.out.println("id: "+ student.getId()+" 전화번호: "+student.getTel());
		}
		scanner.close();
	}

}
