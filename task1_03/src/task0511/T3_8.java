package task0511; // ���� ���� ������ŭ'+'��'*'�� ������ ���� ǥ���ϴ� ���α׷��� �ۼ�
                   //���������� �� �ٲ� ���ڸ� ��� �� ��.

import java.util.Scanner;

public class T3_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("*��+�� � ������ �Է����ּ���");
		int a = scanner.nextInt();
		if( a > 0 ) {
		int i = 0;
		while(i < a) {
	    if (i % 2 == 0)	
	    	System.out.print('*');
	    else	
	    	System.out.print('#');
		i++;
		}
			System.out.println();
		}
			
	}
}
