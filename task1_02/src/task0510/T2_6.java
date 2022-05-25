package task0510;//키보드에서 숫자를 입력받아 작은 수와 큰수를 표현하는 프로그램

import java.util.Scanner;

public class T2_6 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번 째 정수를 입력해주세요");
		int a = scanner.nextInt();
		
		System.out.println("두번 째 정수를 입력해주세요");
		int b = scanner.nextInt();
		
		
		if(a>b) {
			System.out.println("큰수는"+a +"작은수는"+b);
		}else if(a<b) {
			System.out.println("큰수는"+b+"작은수는"+a);
		}else
			System.out.println("값이 동일하다");
				
		
	}

}
