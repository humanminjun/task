package task1_09;

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		//선언
		Scanner scanner = new Scanner(System.in);
		int[][] a = new int [4][3];
		int[][] b = new int [3][4];
		int[][] c = new int [4][4];
		//a행렬
		System.out.println("행렬 a의 요소를 입력해 주세요");
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.printf("a[%d][%d] :", i, j);
				a[i][j] = scanner.nextInt();
				
			}
		}
		
		//b행렬
		System.out.println("행렬 b의 요소를 입력해 주세요");
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("b[%d][%d] :", i, j);
				b[i][j] = scanner.nextInt();
	}

}
		
		//행렬 계산
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				c[i][j] = 0;
				for(int k=0; k<3; k++) {
				c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
				
		//행렬 곱
				
		System.out.println("행렬a와b의 곱");
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("5%d",c[i][j]);
				b[i][j] = scanner.nextInt();
			}
				}
			
			
				
		
	}
}
				
				
				