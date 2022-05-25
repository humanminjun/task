package task0512;//양의 정숫값 n을 읽어서 1~n까지의 곱을 구하자

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner song = new Scanner(System.in);
		int n;
		System.out.println("양의 정숫값을 입력하세요");
		n = song.nextInt();
		
		int x =1;
		int y =1;
		
		while (y <= n) {
			x *= y;
		     y++;
		}
		System.out.println("1부터" +n+"까지의 곱은" + x + "입니다.");
		}
   
}
