package task0511; //2자리 정숫값(10~99)을 맞추는 숫자게임 을만들자( 이프와 두 문을 사용)

import java.util.Random;
import java.util.Scanner;

public class T3_3 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		int q = 10 + rand.nextInt(90);	
		int a;
		do {
		System.out.println("10~99에서 내가 가진 숫자를 맞춰봐");
		a = scanner.nextInt();
	    if(a > q)
	    	System.out.println("땡 좀더 작아");	
	    else if(a<q)
	    	System.out.println("땡 좀더 커");   
		}while(a != q);
		System.out.println("정답이야"+q);
		 scanner.close();
	}
}
