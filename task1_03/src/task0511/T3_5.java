package task0511; //�Է¹��� ���������� 0���� ī��Ʈ�ٿ��ϴ� ���α׷� ����� 
                   //������ ������ Ȯ��
import java.util.Scanner;
public class T3_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��� �ּ���");
		int a = scanner.nextInt();
		do {
		System.out.println(a);
		a=a-1;
		}while(a>=0);
	    System.out.println("��������"+a-- );	
	}
}
