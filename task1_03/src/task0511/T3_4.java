package task0511; //2���� �������� �о ���������̿��ִ� ��� �������� ����( �����ź��� ū����) 

import java.util.Scanner;

public class T3_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù�� °�������� �Է��� �ּ���");
		int a = scanner.nextInt();
		System.out.println("�ι� °�������� �Է��� �ּ���");
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
