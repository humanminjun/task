package task0510;//0,1,2 중 하나의 난수를 생성해서 0이면 가위 ,1이면 바위 ,2이면 보를 표시하는 프로그램

import java.util.Random;

public class T2_9 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("안내면진다 가위바위보");
        int hand = rand.nextInt(3);
        
        switch(hand) {
        case 0 : System.out.println("가위"); break;
        case 1 : System.out.println("바위"); break;
        case 2 : System.out.println("보") ; break;
        }
        
	}

}
