package task0511;//양의 정숫값을 읽어서 그 자릿수를 출력하는 프로그램을 작성하자.

import java.util.Scanner;

public class T3_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇 자리수인지 알려드릴게요.");
		int x;
		do {
			System.out.print("양의 정숫값:");
			x= scanner.nextInt();
		} while(x<=0);
		
		int digit=0; 
		while (x > 0) {
			digit++;
			x /= 10;
		}
		System.out.println("입력한 숫자는" +digit +"자리입니다.");
	}
}
