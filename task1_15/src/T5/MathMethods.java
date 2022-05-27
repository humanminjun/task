package T5; //제곱값,제곱근을 구해 원의 면적 구하기

import java.util.Scanner;

public class MathMethods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("실숫값:");
		double x = scanner.nextDouble();
		
		System.out.println("절댓값:" + Math.abs(x));
		System.out.println("제곱근:" + Math.sqrt(x));
		System.out.println("면 적:" + Math.PI * x * x);
		
		scanner.close();

	}

}
