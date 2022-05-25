package task1_13;

import java.util.Scanner;

public class CarTester2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("차량 데이터를 입력하세요.");
		System.out.print("이 름:");String name = scanner.next();
		System.out.print("번 호:");String number = scanner.next();
		System.out.print("전 폭:");int width = scanner.nextInt();
		System.out.print("전 고:");int height = scanner.nextInt();
		System.out.print("전 장:");int length = scanner.nextInt();
		System.out.print("탱크용량:");double tank = scanner.nextDouble();
		System.out.print("연료량:");double fuel = scanner.nextDouble();
		System.out.print("연 비:");double sfc = scanner.nextDouble();
		
		Car myCar = new Car(name , number, width, height, length, tank, fuel, sfc);
		
		while (true) {
			System.out.printf("현재위치:(%.2f,%.2f)\n", myCar.getX(), myCar.getY());
			System.out.printf("남은 연료:%2f\n", myCar.getFuel());
			System.out.print("이동하시겠습니까?[ 0...No / 1...Yes]");
			if (scanner.nextInt() == 0) break;
			
			System.out.print("X방향으로의 이동 거리:");
			double dx = scanner.nextDouble();
			System.out.print("Y방향으로의 이동 거리");
			double dy = scanner.nextDouble();
			
			if ( !myCar.move(dx, dy))
				System.out.println("연료 부족!!");
		}

	}

}
