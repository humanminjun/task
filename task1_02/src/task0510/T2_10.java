package task0510; // ���� ���� ������ ǥ��

import java.util.Scanner;

public class T2_10 {
    public static void main(String[]args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("����޿� ����ʴϱ�?");
    	int a = scanner.nextInt(); 	
    	
        switch(a){
        case 12 :
        case 1 :
        case 2 : System.out.println("�ܿ�"); break;
        case 3 :
        case 4 :
        case 5 : System.out.println("��"); break;
        case 6 :
        case 7 :
        case 8 : System.out.println("����"); break;
        case 9 :
        case 10 :
        case 11 : System.out.println("�ܿ�"); break;
        default : System.out.println("�׷� ���� �����ϴ�."); break;
    }
    }
}    