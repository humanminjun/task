package task0512; //���� ������ŭ '*'�� ǥ������ 5���� ������ �ٹٲٰ�

import java.util.Scanner;

public class T8_1 {
	public static void main(String[]args) {
	Scanner song = new Scanner(System.in);
	System.out.print("*�� � ������? :");
	int n = song.nextInt();
	for(int i=0; i < n; i++) {
		System.out.print('*');
		if(i%5==4)
			System.out.println();
	}
	
	}
}