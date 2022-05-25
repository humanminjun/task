package task0512; //입력한 정수를 0~입력한정수 까지 카운트하는 프로그램

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		Scanner song = new Scanner(System.in);
		int x;
		int n;
		System.out.println("양의 정숫값을 입력하세요");
		n = song.nextInt();
		for(x=0; x <=n; x++)
			System.out.println(x);

	}

}
