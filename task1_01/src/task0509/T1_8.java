package task0509; //�Է��� �������� 10�� ����̸� '�� ���� 10�� ����Դϴ�.'
        //��� ǥ���ϰ�,�׷��� ������ '�̰��� 10�� ����� �ƴմϴ�.' ��� ǥ���ϴ� 
          //���α׷��� �ۼ��϶�(������ ���� ���"���� �������� �Է��߽��ϴ�."��� ǥ���� ��).
import java.util.Scanner;

public class T1_8 {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���");
		int a = scanner.nextInt();
		
		
   if ( a > 0 ) 
		if  (a % 10 == 0 ) {
	    System.out.println("�� ���� 10�� ����Դϴ�.");	
		
		
		}else   {
			System.out.println("�� ���� 10�� ����� �ƴմϴ�");
			
		}
		  else {
			System.out.println("������ �Է��ϼ̽��ϴ�"); 
			
		}
			
			

	}

}
