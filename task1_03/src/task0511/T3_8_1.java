package task0511;

import java.util.Scanner;

public class T3_8_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇 개의 *를 표시할까요?:");
		int a = scanner.nextInt();
		if(a > 0) {
			int i =0;
			while(i <a/2) {
				System.out.print("*+");
				i++;
			}
			if ( a%2 ==1)
			System.out.print('*');
			System.out.println();
		}
		

	}

}
