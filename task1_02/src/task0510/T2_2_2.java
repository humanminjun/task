package task0510; // 조건연산자 이용

import java.util.Scanner;

public class T2_2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수를 입력하세요");
		int a = scanner.nextInt();
		
		System.out.println("정수를 입력하세요");
		int b = scanner.nextInt();
		

		
	   int diff =  a>b ? a-b : b-a;
	   
	   System.out.println("두값의 차는" + diff + "입니다.");
		
		
}
}