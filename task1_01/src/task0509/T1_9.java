package task0509;//입력한 정숫값을 3으로 나누었을때 나머지 계산하기 (음숫값이면 양수가 아니라고 표시)

import java.util.Scanner;

public class T1_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 입력");
		int a = scanner.nextInt();
		
		
		if(a>0) {
			
		
		if(a % 3 == 0) {
			System.out.println("나머지는 0이다");
		}
		else if ( a % 3 == 1) {
		    System.out.println("나머지는 1이다");
		}else if ( a % 3 == 2) {
		    System.out.println("나머지는 2이다");
		}else
			System.out.println("양수를 입력해주세요");
		
		}
	}

}
