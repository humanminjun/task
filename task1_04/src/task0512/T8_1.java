package task0512; //읽은 갯수만큼 '*'를 표시하자 5개가 넘으면 줄바꾸고

import java.util.Scanner;

public class T8_1 {
	public static void main(String[]args) {
	Scanner song = new Scanner(System.in);
	System.out.print("*을 몇개 만들까요? :");
	int n = song.nextInt();
	for(int i=0; i < n; i++) {
		System.out.print('*');
		if(i%5==4)
			System.out.println();
	}
	
	}
}