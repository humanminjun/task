package task0510; // 입력받은 두 정수를 내림차순으로 정렬

import java.util.Scanner;

public class T2_7 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번 째 정수를 입력해주세요");
		int a = scanner.nextInt();
		
		System.out.println("두번 째 정수를 입력해주세요");
		int b = scanner.nextInt();
		
		if(a<b) {
			int t =a;
			a=b;
			b=t;
			
		}
	System.out.println(a);
	System.out.println(b);
		

	}

}
