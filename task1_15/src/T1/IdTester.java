package T1;

public class IdTester {

	public static void main(String[] args) {
		Id b = new Id();      //식별번호 a번
		Id a = new Id();      //식별번호 b번
		
		
		System.out.println("a의 식별 번호 :" + a.getId());
		System.out.println("b의 식별 번호 :" + b.getId());

		System.out.println("Id.counter =" +Id.counter);
		System.out.println("a.counter =" +a.counter);
		System.out.println("b.counter =" +b .counter);

	}

}
