package task0511; // 읽은 값의 개수만큼'+'와'*'를 번갈아 가며 표시하는 프로그램을 작성
                   //마지막에는 줄 바꿈 문자를 출력 할 것.

import java.util.Scanner;

public class T3_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("*와+를 몇개 만들지 입력해주세요");
		int a = scanner.nextInt();
		if( a > 0 ) {
		int i = 0;
		while(i < a) {
	    if (i % 2 == 0)	
	    	System.out.print('*');
	    else	
	    	System.out.print('#');
		i++;
		}
			System.out.println();
		}
			
	}
}
