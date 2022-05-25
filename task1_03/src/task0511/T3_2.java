package task0511; // 3자리 양의 정숫값을 읽는 프로그램 ( 입력한 정숫값이 3자리가아니면 다시하도록)

import java.util.Scanner;

public class T3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int a;
		do {
		System.out.println("3자리 양의 정숫값을 입력하여 주세요");
	    a = scanner.nextInt();	
		}while(99>a || a>1000);
		System.out.println(a);
		 scanner.close();
	}
}
