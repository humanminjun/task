package task0512;//���� ������ŭ *ǥ��( for�� ��� )

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner song = new Scanner(System.in);
		int n;
		System.out.println("���� �������� �Է��ϼ���");
		n = song.nextInt();
		for(int i=0; i < n; i++)
			System.out.print('*');
		System.out.println();
	}

}
