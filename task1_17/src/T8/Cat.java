package T8;

public class Cat extends Animal {
	private int age; //나이
	
	public Cat(String name, int age) {
		super(name);						//생성자
		this.age = age;
	}



	@Override
	public void bark() {System.out.println("냐옹!");
		// TODO Auto-generated method stub
		
	}
}
