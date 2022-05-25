package task0511;//입력한 값의 개수만큼'*'를 표시하는 프로그램 만들기 2번째 방법

import java.util.Scanner;

public class T3_7_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇 개의 *를 표시할까요?:");
		int a = scanner.nextInt();
		if(a > 0) {
			int i =0;
			while(i < a) {
				System.out.println('*');
				i++;
			}
			System.out.println();
		}
		
	}

}
