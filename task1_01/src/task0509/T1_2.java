package task0509; //�������� �о ������ ǥ���ϴ� �ڵ带 �ۼ��غ���

import java.util.Scanner;

public class T1_2 {
       

	public static void main(String[]args) {
    	   
    do {
   try {
	 Scanner scanner = new Scanner(System. in);
    	   
    	   System.out.println("�������� �Է��ϼ���");   
    	   int n = scanner.nextInt();
    	   	   
    	   
   if(n<0) {
   System.out.println("����="  + -1* n );
    	   
   }	   
   else if(n>0) {
	   System.out.println("����=" + n );
   }
      		
   }catch (Exception e) {
	System.out.println("���ڸ� �����ּ���");
    System.out.println("----------------------------");    
	
 
   }
   
	
    } while(true);

	
   }
    	   
       }

