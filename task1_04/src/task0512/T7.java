package task0512;//���庰 ǥ�� ü�� ����ǥ�� ǥ���ϴ� ���α׷�

import java.util.Scanner;

public class T7 {
	public static void main(String[]args) {
		Scanner song = new Scanner(System.in);
	System.out.print("�ġ ���� :");
	int min = song.nextInt();
	System.out.print("�ġ ���� :");
	int max = song.nextInt();
	System.out.print("�þ�� ���� :");
	int step = song.nextInt();
	System.out.println("���� ǥ��ü��");
	System.out.println("------------------");
	
	for( int i =min; i<=max; i+=step)
		System.out.println(i + "-->" +0.9 *(i -100));
	}
}
