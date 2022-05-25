package task0509;//2개의 양의 정숫값을 읽어서,후자가 전자의 약수이면 "B는 A의 약수이다." 라고 표시하고, 
                   // 그렇지 않으면 "B는 A의 약수가 아니다." 라고 표시하는 프로그램을 작성하기
import java.util.Scanner;
public class T1_3 {
      public static void main(String[]args) {
    	  
    	  Scanner scanner = new Scanner(System.in);
    	
    	  
    	  System.out.println("A값을 입력해주세요");
    	  int a = scanner.nextInt();
    	  
    	 
    	  
    	  System.out.println("B값을 입력해주세요");
    	  int b = scanner.nextInt();
    	  
    	  if( b % a == 0 ) {
    		  System.out.println("B는 A의 약수이다");
    	  }
    	  else { 
    		  System.out.println("B는 A의 약수가 아니다");
    	  }
    	  
      

	}

	
}
