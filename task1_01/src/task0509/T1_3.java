package task0509;//2���� ���� �������� �о,���ڰ� ������ ����̸� "B�� A�� ����̴�." ��� ǥ���ϰ�, 
                   // �׷��� ������ "B�� A�� ����� �ƴϴ�." ��� ǥ���ϴ� ���α׷��� �ۼ��ϱ�
import java.util.Scanner;
public class T1_3 {
      public static void main(String[]args) {
    	  
    	  Scanner scanner = new Scanner(System.in);
    	
    	  
    	  System.out.println("A���� �Է����ּ���");
    	  int a = scanner.nextInt();
    	  
    	 
    	  
    	  System.out.println("B���� �Է����ּ���");
    	  int b = scanner.nextInt();
    	  
    	  if( b % a == 0 ) {
    		  System.out.println("B�� A�� ����̴�");
    	  }
    	  else { 
    		  System.out.println("B�� A�� ����� �ƴϴ�");
    	  }
    	  
      

	}

	
}
