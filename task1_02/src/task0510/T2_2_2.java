package task0510; // ���ǿ����� �̿�

import java.util.Scanner;

public class T2_2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���");
		int a = scanner.nextInt();
		
		System.out.println("������ �Է��ϼ���");
		int b = scanner.nextInt();
		

		
	   int diff =  a>b ? a-b : b-a;
	   
	   System.out.println("�ΰ��� ����" + diff + "�Դϴ�.");
		
		
}
}