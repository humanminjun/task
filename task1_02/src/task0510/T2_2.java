package task0510; //2���� �������� �о �ΰ��� ���� ǥ���ϴ� ���α׷� �ۼ�
                  //if,else �̿�

import java.util.Scanner;

public class T2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���");
		int a = scanner.nextInt();
		
		System.out.println("������ �Է��ϼ���");
		int b = scanner.nextInt();
		
		if(a>b) { 
			System.out.println(a-b);
		}else {
		System.out.println(b-a);
		}
	}
	

}

