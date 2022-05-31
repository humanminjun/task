package T9;

public class Cat extends Animal{
	private int age;
	public Cat(String name,int age) {
		super(name);this.age = age;
	}
	@Override
	public void bark() {System.out.println("냐옹!");
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return age + "의" +getName();
	}
	
}
