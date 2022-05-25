package task0509; //정숫값을 읽어서 절댓값을 표시하는 코드를 작성해보자

import java.util.Scanner;

public class T1_2 {
       

	public static void main(String[]args) {
    	   
    do {
   try {
	 Scanner scanner = new Scanner(System. in);
    	   
    	   System.out.println("정숫값을 입력하세요");   
    	   int n = scanner.nextInt();
    	   	   
    	   
   if(n<0) {
   System.out.println("절댓값="  + -1* n );
    	   
   }	   
   else if(n>0) {
	   System.out.println("절댓값=" + n );
   }
      		
   }catch (Exception e) {
	System.out.println("숫자를 입해주세요");
    System.out.println("----------------------------");    
	
 
   }
   
	
    } while(true);

	
   }
    	   
       }

