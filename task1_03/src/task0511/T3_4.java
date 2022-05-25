package task0511; //2개의 정숫값을 읽어서 두정수사이에있는 모든 정숫값을 읽자( 작은거부터 큰숫자) 

import java.util.Scanner;

public class T3_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번 째정숫값을 입력해 주세요");
		int a = scanner.nextInt();
		System.out.println("두번 째정숫값을 입력해 주세요");
		int b = scanner.nextInt();
		if(a>b) {
			int t = a;
			a=b;
			b=t;
		}
		do {
			System.out.print((a+1) + " ");
			a=a+1;	
		}while(a<b-1);
		System.out.println();
	 scanner.close();
	}
}
