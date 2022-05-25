package task1_12;//배열에서 요소를 삭제한 배열을 반환

import java.util.Scanner;

class T2 {
	//배열a에서 a[idx]를 삭제한 배열을 반환
	static int[] arrayRmvOf(int[]a,int idx) {
		if (idx < 0 && idx >= a.length -1)
		return a.clone();      //a의 복사본을 그대로 반환
		else {
			int[] c = new int[a.length -1];
			int i = 0;
			for ( ; i < idx; i++)
				c[i] = a[i];
			for ( ; i < a.length -1; i++)
				c[i] = a[i + 1];
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
		System.out.print("삭제할 요소의 인덱스:");
		int idx = scanner.nextInt();
		
		int[] y = arrayRmvOf(x, idx);
		
		for (int i = 0; i < y.length; i++)
			System.out.println("y[" + i + "] =" +y[i]);

	}

}
