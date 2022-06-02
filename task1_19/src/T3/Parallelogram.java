package T3;

public class Parallelogram extends Shape implements Plane2D{
	private int width;  //밑변의 너비
	private int height; //높이
	
	public Parallelogram(int width, int height) {
		this.width = width; this.height = height;
	}

	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Parallelogram(width:" +width+",height:"+ ")" ;
	}

	@Override
	public void draw() {
		for (int i = 1; i <= height ; i++) {
			for (int j = 1; j <= height -j; j++)System.out.print(' ');
			for (int j = 1; j <= width; j++)System.out.print('#');
			System.out.println();
		}
		
	}
	@Override
	public int getArea() {return width * height;}
}
