package task0509;//2개의 변수 a,b 에 값을 읽어서 a,b의 대소관계를 다음과 같이 표시하는 프로그램을 작성하자.

import java.util.Scanner;

//ex: a가크다,b가크다,a와b가 같다

public class T1_6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("a값을 입력하세여");
		int a = scanner.nextInt() ;
		System.out.println("b값을 입력하세여");
		int b = scanner.nextInt() ;
		
		if( a> b ) {
			System.out.println("a가 b보다 크다");
		}
		else if( a< b ) {
			System.out.println("a가 b보다 작다");
		}
		else if ( a == b ) {
			System.out.println("a와b가 같다");
		}
		
		
		
		
		
		
	}

}
