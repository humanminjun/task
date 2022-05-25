package task0509; //성적을 입력하여 수우미양가 계산하기

import java.util.Scanner;

public class T1_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적을 입력해주세요");
	    int a = scanner.nextInt();
	    
	   if(a<100) 
	    {
	    if (100>= a &&a>=90) {
	    	System.out.println("수");
	    }
       		
	    else if  (80 <= a && a <90) {
	    	System.out.println("미");
	    }
		
	    else if (70 <= a && a<80) {
	    	System.out.println("양");
	    }
		
	    else if (0<=a && a<70 ) {
	    	System.out.println("가");
	    }
	   }else if( a <0) {
		   System.out.println("양수좀 입력해라 제발");
		
	  
	   }else {
		System.out.println("100밑으로 입력해라");
	   }
	    
		  
		
	}

}
