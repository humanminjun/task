package task0510; //세개의 정수를 입력받아 중앙값을 출력하는 프로그램

import java.util.Scanner;

public class T2_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번 째 정수를 입력해주세요");
		int a = scanner.nextInt();
		
		System.out.println("두번 째 정수를 입력해주세요");
		int b = scanner.nextInt();
		
		System.out.println("세번 째 정수를 입력해주세요");
		int c = scanner.nextInt();
		
		if(a<=b && b <=c) {
			System.out.println(b);
		}else if(b<=a && a <=c) {
			System.out.println(a);
		}else if(a<=c && c <=b) {
			System.out.println(c);
	    }else if(c<=a && a <=b) {
		    System.out.println(a);
	    }else if(b<=c && c <=a) {
	     	System.out.println(c);
        }else if(c<=a && a <=b) {
	        System.out.println(a);
        }else if(c<=b && b <=a) {
				System.out.println(b);
        }
        }

}
