package task0510; //두 정숫값의 차가 10이하인 경우 "두 값의 차는 10 이하입니다." 라고 표시하고, 
                  //그렇지 않으면" 두값의 차는 11이상입니다" 라고 표시하기
import java.util.Scanner;



public class T2_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수 입력해");
		int a = scanner.nextInt();
		
		System.out.println("첫번째 정수 입력해");
		int b = scanner.nextInt();
		
		int song = a >= b ? a-b  : b-a ;
				System.out.println("두값의 차이는" + (song <=10 ? "10이하입니다" : "10이상입니다"));

	}

}
