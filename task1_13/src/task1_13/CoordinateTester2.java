package task1_13;

import java.util.Scanner;

class CoordinateTester2 {
	static boolean comCoordinate(Coordinate c1, Coordinate c2) {
		return c1.getX() == c2.getX() && c1.getY() == c2.getY();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double x,y;
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("X좌표 :"); x = scanner.nextDouble();
		System.out.print("Y좌표 :"); y = scanner.nextDouble();
		Coordinate p = new Coordinate(x, y);
		
		System.out.println("좌표 q를 입력하세요.");
		System.out.print("X좌표 :"); x = scanner.nextDouble();
		System.out.print("Y좌표 :"); y = scanner.nextDouble();
		Coordinate q = new Coordinate(x, y);
		
		System.out.println((p == q)
							? "p == q입니다."
							: "p != q입니다.");
		System.out.println(p.getX() == q.getX() &&
							p.getY() == q.getY()
							? "p 와 q같습니다."
							: "p 와 q다릅니다.");
		System.out.println(comCoordinate(p,q)
							? "p 와 q같습니다."
							: "p 와 q다릅니다.");
	}

}
