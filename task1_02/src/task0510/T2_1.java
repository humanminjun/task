package task0510; //2개의 실숫값을 읽어서 더 큰숫자를 표시

import java.util.Scanner;

public class T2_1 {
    public static void main(String[]args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("첫번째 실수를 입력하세요:");
    	double a = scanner.nextDouble();
    	
    	System.out.println("두번째 실수를 입력하세요:");
    	double b = scanner.nextDouble();
    	
    	if(a>b) {
    		System.out.println(a);
    	}else {
    		System.out.println(b);
    	}
    	scanner.close();
    }
}
