package task1_13;

class Human2 {
	private String name;
	private int height;
	private int weight;
	
	Human2(String n, int h, int w){
		name = n; height = h; weight = w;
	}
	String getName() { return name;}
	int getheight() {return height;}
	int getweight() {return weight;}
	
	void gainWeight(int w)  {weight += w;}
	void reduceWeight(int w)  {weight -= w;}
	
}
