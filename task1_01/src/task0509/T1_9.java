package task0509;//�Է��� �������� 3���� ���������� ������ ����ϱ� (�������̸� ����� �ƴ϶�� ǥ��)

import java.util.Scanner;

public class T1_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �Է�");
		int a = scanner.nextInt();
		
		
		if(a>0) {
			
		
		if(a % 3 == 0) {
			System.out.println("�������� 0�̴�");
		}
		else if ( a % 3 == 1) {
		    System.out.println("�������� 1�̴�");
		}else if ( a % 3 == 2) {
		    System.out.println("�������� 2�̴�");
		}else
			System.out.println("����� �Է����ּ���");
		
		}
	}

}
