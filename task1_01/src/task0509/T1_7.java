package task0509; //입력한 정숫값이 5로 나누어떨어지면 "이 값은 5로 나누어집니다."라고표시 그렇지않으면
                   //"이값은 5로 나누어지지 않습니다." 라고 표시하는 프로그램 만들기

import java.util.Scanner;


public class T1_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("정숫값을 입력하세요");
        int a = scanner.nextInt();
        
        if( 5 % a == 0) {
        	System.out.println("이값은 5로나누어집니다");
        }
        else {
        	System.out.println("이값은 5로 나누어지지않습니다");
        }
        	
		
		
		
		
		
	}

}
