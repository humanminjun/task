package task0510; //�� �������� ���� 10������ ��� "�� ���� ���� 10 �����Դϴ�." ��� ǥ���ϰ�, 
                  //�׷��� ������" �ΰ��� ���� 11�̻��Դϴ�" ��� ǥ���ϱ�
import java.util.Scanner;



public class T2_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù��° ���� �Է���");
		int a = scanner.nextInt();
		
		System.out.println("ù��° ���� �Է���");
		int b = scanner.nextInt();
		
		int song = a >= b ? a-b  : b-a ;
				System.out.println("�ΰ��� ���̴�" + (song <=10 ? "10�����Դϴ�" : "10�̻��Դϴ�"));

	}

}
