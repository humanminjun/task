package task0509; //������ �Է��Ͽ� ����̾簡 ����ϱ�

import java.util.Scanner;

public class T1_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է����ּ���");
	    int a = scanner.nextInt();
	    
	   if(a<100) 
	    {
	    if (100>= a &&a>=90) {
	    	System.out.println("��");
	    }
       		
	    else if  (80 <= a && a <90) {
	    	System.out.println("��");
	    }
		
	    else if (70 <= a && a<80) {
	    	System.out.println("��");
	    }
		
	    else if (0<=a && a<70 ) {
	    	System.out.println("��");
	    }
	   }else if( a <0) {
		   System.out.println("����� �Է��ض� ����");
		
	  
	   }else {
		System.out.println("100������ �Է��ض�");
	   }
	    
		  
		
	}

}
