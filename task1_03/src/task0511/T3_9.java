package task0511;//���� �������� �о �� �ڸ����� ����ϴ� ���α׷��� �ۼ�����.

import java.util.Scanner;

public class T3_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� �ڸ������� �˷��帱�Կ�.");
		int x;
		do {
			System.out.print("���� ������:");
			x= scanner.nextInt();
		} while(x<=0);
		
		int digit=0; 
		while (x > 0) {
			digit++;
			x /= 10;
		}
		System.out.println("�Է��� ���ڴ�" +digit +"�ڸ��Դϴ�.");
	}
}
