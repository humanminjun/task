package task0512;//신장별 표준 체중 대응표를 표시하는 프로그램

import java.util.Scanner;

public class T7 {
	public static void main(String[]args) {
		Scanner song = new Scanner(System.in);
	System.out.print("몇센치 부터 :");
	int min = song.nextInt();
	System.out.print("몇센치 까지 :");
	int max = song.nextInt();
	System.out.print("늘어나는 범위 :");
	int step = song.nextInt();
	System.out.println("신장 표준체중");
	System.out.println("------------------");
	
	for( int i =min; i<=max; i+=step)
		System.out.println(i + "-->" +0.9 *(i -100));
	}
}
