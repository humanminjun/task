package task0511; //5���������� x-- �� --x �� �ٲٸ� ��� �ٲ���� Ȯ��

import java.util.Scanner;
public class T3_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��� �ּ���");
		int a = scanner.nextInt();
		do {
		System.out.println(a);
		a=a-1;
		}while(a>=0);
	    System.out.println("��������"+ (--a) );//--������ �ٲٴ� �������� 1�۾�����
	}
}
