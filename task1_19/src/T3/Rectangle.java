package T3;

public class Rectangle extends Shape implements Plane2D{
	private int width;		//너비
	private int height;		//높이
	
	public Rectangle(int width, int height) {
		this.width = width; this.height = height;
	}
	
	public String toString() {
		return "Rectangle(with:" + width + ", height:" +height + ")";
	}
	
	public void draw() {
		for (int i = 1; i <= height; i++) {
			for(int j = 1; j <= width; j++)
				System.out.print('*');
				System.out.println();
		}
	}
	public int getArea() {return width * height;}
}
