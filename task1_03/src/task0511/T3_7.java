package task0511; //�Է��� ���� ������ŭ'*'�� ǥ���ϴ� ���α׷� ����� 
                  //���������� �� �ٲ� ���ڸ� ����ض� �� ���� ���� 1�̸��̸� �� �ٲ� x

import java.util.Scanner;

public class T3_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
	System.out.println("*�� � ������ �Է����ּ���");
	int a = scanner.nextInt();
	if(a>0) {
		int i = 0;
		while(i < a) {
			System.out.print('*');
			i++;
		}
        System.out.println();	
	    }
	}
}
