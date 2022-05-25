package task1_12;

import java.util.Scanner;

class T6 {
	static int[][] aryClone2(int[][]a) {
		int[][] c = new int[a.length][];
		for (int i = 0; i < a.length; i++) {
			 c[i] = new int[a[i].length];
		for (int j = 0; j < a.length; j++)
			c[i][j] = a[i][j];
	}
	return c;
}
	static void printMatrix(int[][] m) {
		for (int i =0 ; i < m.length; i++) {
			for (int j =0 ; i < m[i].length; j++)
		}
	
	
	
		int[] c = new int[count--];
		for (int i =a.length -1; count >=0; i--)
			if (a[i] == x)
				c[count--] = i;
		return c;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int num = scanner.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i <num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = scanner.nextInt();
		}
		
		System.out.print("탐색할 값:");
		int n = scanner.nextInt();
		int[] b = arraySrchIdx(x,n);
		
		if (b.length == 0)
			System.out.println("일치하는 요소가 없습니다.");
		else {
			System.out.println("일치하는 요소의 인덱스");
			for (int i = 0; i < b.length; i++)
				System.out.println(b[i]);
		}

	}

}
