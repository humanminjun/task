package task0512; //5�������� �����ؼ� ���ĵ� ���Խ��Ѻ���

import java.util.Scanner;

public class T6 {
	public static void main(String[]args) {
		Scanner song = new Scanner(System.in);
		System.out.println("���� �������� �Է��ϼ���");
			int sum = 0;
		int n = song.nextInt();
		for(int x=1; x<n; x++) {
			System.out.print(x + "+");
			sum += x;
		}
		System.out.print(n+ "=");
		sum += n;
		System.out.println(sum);
		
	}
}
