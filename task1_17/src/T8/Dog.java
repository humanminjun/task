package T8;

public class Dog extends Animal {
	private String type;
	public Dog(String name, String type) {        //생성자
		super(name);this.type = type;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bark() {System.out.println("멍멍!"); //짖기
		// TODO Auto-generated method stub
		
	}

}
