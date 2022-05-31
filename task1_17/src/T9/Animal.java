package T9;

abstract class Animal {
	private String name;	
	public Animal(String name) {this.name = name;}
	public abstract void bark();
	public String getName() {return name;}		//이름 확인
	public abstract String toString();			//문자열 표현 반환
	public void introduce() {
		System.out.print(toString()+"이다.");
		bark();
	}
}
