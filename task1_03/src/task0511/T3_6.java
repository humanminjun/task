package task0511; //5번문제에서 x-- 를 --x 로 바꾸면 어떻게 바뀌는지 확인

import java.util.Scanner;
public class T3_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요");
		int a = scanner.nextInt();
		do {
		System.out.println(a);
		a=a-1;
		}while(a>=0);
	    System.out.println("변수값은"+ (--a) );//--방향을 바꾸니 변수값이 1작아졌다
	}
}
