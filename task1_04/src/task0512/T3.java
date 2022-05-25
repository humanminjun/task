package task0512;//양의 정숫값을 0까지 카운트 다운하는 프로그램(for문으로 작성)

import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		Scanner song = new Scanner(System.in);
		int n;
		System.out.println("양의 정숫값을 입력하세요");
		n = song.nextInt();
		for(; n >=0; n--)
			System.out.println(n);
	}

}
