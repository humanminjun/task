package task0512;//1부터 n까지의 합을 구하는 프로그램(for문 이용)

import java.util.Scanner;

public class T5 {
	public static void main(String[]args) {	
	Scanner song = new Scanner(System.in);
	System.out.println("양의 정숫값을 입력하세요");
		int sum = 0;
	int n = song.nextInt();
	for(int x=0; x<=n; x++)
		sum += x;
	System.out.println(sum);
		
}
}