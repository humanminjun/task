package task0512;//���� ������ n�� �о 1~n������ ���� ������

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner song = new Scanner(System.in);
		int n;
		System.out.println("���� �������� �Է��ϼ���");
		n = song.nextInt();
		
		int x =1;
		int y =1;
		
		while (y <= n) {
			x *= y;
		     y++;
		}
		System.out.println("1����" +n+"������ ����" + x + "�Դϴ�.");
		}
   
}
