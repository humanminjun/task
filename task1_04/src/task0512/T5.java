package task0512;//1���� n������ ���� ���ϴ� ���α׷�(for�� �̿�)

import java.util.Scanner;

public class T5 {
	public static void main(String[]args) {	
	Scanner song = new Scanner(System.in);
	System.out.println("���� �������� �Է��ϼ���");
		int sum = 0;
	int n = song.nextInt();
	for(int x=0; x<=n; x++)
		sum += x;
	System.out.println(sum);
		
}
}