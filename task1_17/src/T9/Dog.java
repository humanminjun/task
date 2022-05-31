package T9;

	class Dog extends Animal{
	private String type;

	public Dog(String name, String type) {super(name);this.type = type;	}

	@Override
	public void bark() { System.out.println("멍멍!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return type + "의" + getName();
	}
	
}
