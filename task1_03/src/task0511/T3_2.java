package task0511; // 3�ڸ� ���� �������� �д� ���α׷� ( �Է��� �������� 3�ڸ����ƴϸ� �ٽ��ϵ���)

import java.util.Scanner;

public class T3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int a;
		do {
		System.out.println("3�ڸ� ���� �������� �Է��Ͽ� �ּ���");
	    a = scanner.nextInt();	
		}while(99>a || a>1000);
		System.out.println(a);
		 scanner.close();
	}
}
