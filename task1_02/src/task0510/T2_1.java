package task0510; //2���� �Ǽ����� �о �� ū���ڸ� ǥ��

import java.util.Scanner;

public class T2_1 {
    public static void main(String[]args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("ù��° �Ǽ��� �Է��ϼ���:");
    	double a = scanner.nextDouble();
    	
    	System.out.println("�ι�° �Ǽ��� �Է��ϼ���:");
    	double b = scanner.nextDouble();
    	
    	if(a>b) {
    		System.out.println(a);
    	}else {
    		System.out.println(b);
    	}
    	scanner.close();
    }
}
