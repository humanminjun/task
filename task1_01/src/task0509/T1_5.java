package task0509; // 정숫값을 읽어 부호(양수/음수/0)를 판정하는 프로그램을 작성하자.

import java.util.Scanner;

public class T1_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정숫값을 입력하세요");
	    int a = scanner.nextInt();
	    
	    if(a<0) {
	    	System.out.println("정수는 음수다");
	    }
		
	    else if(a == 0) {
	    	System.out.println("정수는 0이다");
	    }
		
	    else if(a > 0) {
	    	System.out.println("정수는 양수다");
	    }
		
		
		
		
		
		
		
		
		
	}

}
