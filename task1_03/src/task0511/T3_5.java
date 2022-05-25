package task0511; //입력받은 정숫값부터 0까지 카운트다운하는 프로그램 만들기 
                   //종료후 변숫값 확인
import java.util.Scanner;
public class T3_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요");
		int a = scanner.nextInt();
		do {
		System.out.println(a);
		a=a-1;
		}while(a>=0);
	    System.out.println("변수값은"+a-- );	
	}
}
