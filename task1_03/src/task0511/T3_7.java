package task0511; //입력한 값의 개수만큼'*'를 표시하는 프로그램 만들기 
                  //마지막에는 줄 바꿈 문자를 출력해라 단 읽은 값이 1미만이면 줄 바꿈 x

import java.util.Scanner;

public class T3_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
	System.out.println("*을 몇개 만들지 입력해주세요");
	int a = scanner.nextInt();
	if(a>0) {
		int i = 0;
		while(i < a) {
			System.out.print('*');
			i++;
		}
        System.out.println();	
	    }
	}
}
