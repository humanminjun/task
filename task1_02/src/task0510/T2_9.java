package task0510;//0,1,2 �� �ϳ��� ������ �����ؼ� 0�̸� ���� ,1�̸� ���� ,2�̸� ���� ǥ���ϴ� ���α׷�

import java.util.Random;

public class T2_9 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("�ȳ������� ����������");
        int hand = rand.nextInt(3);
        
        switch(hand) {
        case 0 : System.out.println("����"); break;
        case 1 : System.out.println("����"); break;
        case 2 : System.out.println("��") ; break;
        }
        
	}

}
