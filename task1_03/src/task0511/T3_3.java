package task0511; //2�ڸ� ������(10~99)�� ���ߴ� ���ڰ��� ��������( ������ �� ���� ���)

import java.util.Random;
import java.util.Scanner;

public class T3_3 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		int q = 10 + rand.nextInt(90);	
		int a;
		do {
		System.out.println("10~99���� ���� ���� ���ڸ� �����");
		a = scanner.nextInt();
	    if(a > q)
	    	System.out.println("�� ���� �۾�");	
	    else if(a<q)
	    	System.out.println("�� ���� Ŀ");   
		}while(a != q);
		System.out.println("�����̾�"+q);
		 scanner.close();
	}
}
