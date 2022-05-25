package task1_12;//배열에 요소를 삽입해서 반환

import java.util.Scanner;

class T4 {
	static int[] arrayRmvOfN(int[]a,int idx, int x) {
		if (idx < 0 || idx >a.length)
		return a.clone();      //a의 복사본을 그대로 반환
		else {
			int[] c = new int[a.length + 1];
			int i = 0;
			for ( ; i < idx; i++)
				c[i] = a[i];
			for ( ; i < a.length; i++)
				c[i +1 ] = a[i];
			c[idx] = x;
			return c;
		}
}
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("요소 수 :");
		int num = scanner.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = scanner.nextInt();
		}
		System.out.print("삽입할 인덱스:");
		int idx = scanner.nextInt();
		System.out.print("삽입할 값:");
		int n = scanner.nextInt();
		
		int[] y = arrayRmvOfN(x,idx,n);
		
		for (int i = 0; i < y.length; i++)
			System.out.println("y[" + i + "] =" + y[i]);
}
}


