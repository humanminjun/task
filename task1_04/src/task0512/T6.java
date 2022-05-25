package task0512; //5번문제를 수정해서 계산식도 포함시켜보자

import java.util.Scanner;

public class T6 {
	public static void main(String[]args) {
		Scanner song = new Scanner(System.in);
		System.out.println("양의 정숫값을 입력하세요");
			int sum = 0;
		int n = song.nextInt();
		for(int x=1; x<n; x++) {
			System.out.print(x + "+");
			sum += x;
		}
		System.out.print(n+ "=");
		sum += n;
		System.out.println(sum);
		
	}
}
