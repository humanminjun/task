package task0509;//2���� ���� a,b �� ���� �о a,b�� ��Ұ��踦 ������ ���� ǥ���ϴ� ���α׷��� �ۼ�����.

import java.util.Scanner;

//ex: a��ũ��,b��ũ��,a��b�� ����

public class T1_6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("a���� �Է��ϼ���");
		int a = scanner.nextInt() ;
		System.out.println("b���� �Է��ϼ���");
		int b = scanner.nextInt() ;
		
		if( a> b ) {
			System.out.println("a�� b���� ũ��");
		}
		else if( a< b ) {
			System.out.println("a�� b���� �۴�");
		}
		else if ( a == b ) {
			System.out.println("a��b�� ����");
		}
		
		
		
		
		
		
	}

}
