package task0510; //������ ������ �Է¹޾� �߾Ӱ��� ����ϴ� ���α׷�

import java.util.Scanner;

public class T2_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù�� ° ������ �Է����ּ���");
		int a = scanner.nextInt();
		
		System.out.println("�ι� ° ������ �Է����ּ���");
		int b = scanner.nextInt();
		
		System.out.println("���� ° ������ �Է����ּ���");
		int c = scanner.nextInt();
		
		if(a<=b && b <=c) {
			System.out.println(b);
		}else if(b<=a && a <=c) {
			System.out.println(a);
		}else if(a<=c && c <=b) {
			System.out.println(c);
	    }else if(c<=a && a <=b) {
		    System.out.println(a);
	    }else if(b<=c && c <=a) {
	     	System.out.println(c);
        }else if(c<=a && a <=b) {
	        System.out.println(a);
        }else if(c<=b && b <=a) {
				System.out.println(b);
        }
        }

}
