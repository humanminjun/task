package task1_12;

import java.util.Scanner;

class T3 {
	static int[] arrayRmvOfN(int[]a,int idx, int n) {
		if (n < 0 || idx >a.length)
		return a.clone();      //a의 복사본을 그대로 반환
		else {
			if (idx + n > a.length)
				n = a.length - idx;
			int[] c = new int[a.length -n];
			int i = 0;
			for ( ; i < idx; i++)
				c[i] = a[i];
			for ( ; i < a.length -n; i++)
				c[i] = a[i + n];
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
		System.out.print("삭제를 시작할 요소의 인덱스:");
		int idx = scanner.nextInt();
		System.out.print("삭제할 요소의 인덱스:");
		int n = scanner.nextInt();
		
		// 배열 x의 x[idx]부터 n개의 요소를 삭제한 배열 생성
		int[] y = arrayRmvOfN(x,idx,n);
		
		for (int i = 0; i < y.length; i++)
			System.out.println("y[" + i + "] =" + y[i]);
}
}






