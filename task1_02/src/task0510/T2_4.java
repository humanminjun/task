package task0510;//�Է��� 3�������� �� �ּڰ��� ���ϴ� ���α׷�

import java.util.Scanner;

public class T2_4 {
    public static void main(String[]args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("ù�� ° ������ �Է��Ͽ� �ּ���");
    	int a = scanner.nextInt();
    	
    	System.out.println("�ι� ° ������ �Է��Ͽ� �ּ���");
    	int b = scanner.nextInt();
    	
    	System.out.println("���� ° ������ �Է��Ͽ� �ּ���");
    	int c = scanner.nextInt();
    	
    	if (a<b && a<c) {
    		System.out.println(a);
    	}else if(b<a && b<c) {
    		System.out.println(b);
    	}else {
    		System.out.println(c);
    	}
    	
    }
}
