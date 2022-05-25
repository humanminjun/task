package task0509;//키보드로 입력한 정수값이 음이면 "이 값은 음의 값입니다."라고 표시하는 프로그램 작성하기

import java.util.Scanner;

public class T1_1 {
     public static void main(String[]args) {
    	  
    	 Scanner scanner = new Scanner(System.in);
    	
   
    
     System.out.println("정수값을 입력하세요");
        int n = scanner.nextInt();
		
        
        if(n<0) {
        	System.out.println("이 값은 음의 값입니다");
        }
        scanner.close();
     }
}
