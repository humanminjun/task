package task0509; //입력한 정숫값이 10의 배수이면 '이 값은 10의 배수입니다.'
        //라고 표시하고,그렇지 않으면 '이값은 10의 배수가 아닙니다.' 라고 표시하는 
          //프로그램을 작성하라(음수를 읽은 경우"음의 정숫값을 입력했습니다."라고 표시할 것).
import java.util.Scanner;

public class T1_8 {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정숫값을 입력하세요");
		int a = scanner.nextInt();
		
		
   if ( a > 0 ) 
		if  (a % 10 == 0 ) {
	    System.out.println("이 값은 10의 배수입니다.");	
		
		
		}else   {
			System.out.println("이 값은 10의 배수가 아닙니다");
			
		}
		  else {
			System.out.println("음수를 입력하셨습니다"); 
			
		}
			
			

	}

}
