package task0510;//Ű���忡�� ���ڸ� �Է¹޾� ���� ���� ū���� ǥ���ϴ� ���α׷�

import java.util.Scanner;

public class T2_6 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù�� ° ������ �Է����ּ���");
		int a = scanner.nextInt();
		
		System.out.println("�ι� ° ������ �Է����ּ���");
		int b = scanner.nextInt();
		
		
		if(a>b) {
			System.out.println("ū����"+a +"��������"+b);
		}else if(a<b) {
			System.out.println("ū����"+b+"��������"+a);
		}else
			System.out.println("���� �����ϴ�");
				
		
	}

}
