package task0511;//�Է��� ���� ������ŭ'*'�� ǥ���ϴ� ���α׷� ����� 2��° ���

import java.util.Scanner;

public class T3_7_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� ���� *�� ǥ���ұ��?:");
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
