package task0512;//읽은 개수만큼 *표시( for문 사용 )

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner song = new Scanner(System.in);
		int n;
		System.out.println("양의 정숫값을 입력하세요");
		n = song.nextInt();
		for(int i=0; i < n; i++)
			System.out.print('*');
		System.out.println();
	}

}
