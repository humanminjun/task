package task1_14;

class Human {
	private String name;
	private int height;
	private int weight;
	
	Human(String n, int h, int w){
		name = n; height = h; weight = w;
	}
	String getName() { return name;}
	int getheight() {return height;}
	int getweight() {return weight;}
	
	void gainWeight(int w)  {weight += w;}
	void reduceWeight(int w)  {weight -= w;}
	
}
