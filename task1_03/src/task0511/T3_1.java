package task0511; //���� �������� ��ȣ�� �����ؼ� ǥ�� (���ϴ� ��ŭ �ݺ�)

import java.util.Scanner;

public class T3_1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int retry;
		do {
			System.out.println("������:");
		    double n = scanner.nextDouble();
		    
		    if(n>0)
		    	System.out.println("�� ���� ����Դϴ�.");
		    else if (n<0)
		    	System.out.println("�� ���� �����Դϴ�.");
		    else
		    	System.out.println("�� ���� 0�Դϴ�.");
			
		    System.out.print(" �ٽ� �ѹ�? 1-Yes / 0-No :");
		    retry = scanner.nextInt();		
		   }while (retry==1);	
	        scanner.close();
	}
}

