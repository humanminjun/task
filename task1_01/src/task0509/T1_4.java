package task0509; //����° ������ ������������(!)�� �̿��Ͽ� ��������

import java.util.Scanner;

public class T1_4 {

	public static void main(String[] args) {
		  
  	  Scanner scanner = new Scanner(System.in);
  	
  	  
  	  System.out.println("A���� �Է����ּ���");
  	  int a = scanner.nextInt();
  	  
  	 
  	  
  	  System.out.println("B���� �Է����ּ���");
  	  int b = scanner.nextInt();
  	  
  	  if(! (b % a == 0) ) {
  		  System.out.println("B�� A�� ����� �ƴϴ�");
  	  }
  	  else { 
  		  System.out.println("B�� A�� �����");
  	  }
  	  
	}

}
