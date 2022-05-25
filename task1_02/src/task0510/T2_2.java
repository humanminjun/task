package task0510; //2개의 정수값을 읽어서 두값의 차를 표시하는 프로그램 작성
                  //if,else 이용

import java.util.Scanner;

public class T2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수를 입력하세요");
		int a = scanner.nextInt();
		
		System.out.println("정수를 입력하세요");
		int b = scanner.nextInt();
		
		if(a>b) { 
			System.out.println(a-b);
		}else {
		System.out.println(b-a);
		}
	}
	

}

