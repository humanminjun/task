package task0509; //세번째 문제를 논리부정연산자(!)를 이용하여 수정하자

import java.util.Scanner;

public class T1_4 {

	public static void main(String[] args) {
		  
  	  Scanner scanner = new Scanner(System.in);
  	
  	  
  	  System.out.println("A값을 입력해주세요");
  	  int a = scanner.nextInt();
  	  
  	 
  	  
  	  System.out.println("B값을 입력해주세요");
  	  int b = scanner.nextInt();
  	  
  	  if(! (b % a == 0) ) {
  		  System.out.println("B는 A의 약수가 아니다");
  	  }
  	  else { 
  		  System.out.println("B는 A의 약수다");
  	  }
  	  
	}

}
