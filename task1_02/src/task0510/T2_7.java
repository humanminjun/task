package task0510; // �Է¹��� �� ������ ������������ ����

import java.util.Scanner;

public class T2_7 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù�� ° ������ �Է����ּ���");
		int a = scanner.nextInt();
		
		System.out.println("�ι� ° ������ �Է����ּ���");
		int b = scanner.nextInt();
		
		if(a<b) {
			int t =a;
			a=b;
			b=t;
			
		}
	System.out.println(a);
	System.out.println(b);
		

	}

}
