package task0510;//입력한 3개의정수 중 최솟값을 구하는 프로그램

import java.util.Scanner;

public class T2_4 {
    public static void main(String[]args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("첫번 째 정수를 입력하여 주세요");
    	int a = scanner.nextInt();
    	
    	System.out.println("두번 째 정수를 입력하여 주세요");
    	int b = scanner.nextInt();
    	
    	System.out.println("세번 째 정수를 입력하여 주세요");
    	int c = scanner.nextInt();
    	
    	if (a<b && a<c) {
    		System.out.println(a);
    	}else if(b<a && b<c) {
    		System.out.println(b);
    	}else {
    		System.out.println(c);
    	}
    	
    }
}
