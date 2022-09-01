package multidimensional_array;

import java.util.Scanner;

public class Triangle2 {

	public static void main(String[] args) {
		int i, j, middle, k, L;
		int[][] a;
		a = new int[10][10];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 입력(10이하):");
		int x = sc.nextInt();
		
		k = 0;
		middle = x/2;
		
		
		for(i = 0; i <= x-1; i++) {
			if(i < middle) {
				L = x - i;
			}else {
				L = i + 1;
			}
			
			for(j = 0; j <= L-1; j++) {
				k++;
				a[i][j] = k;
			}
		}
		
		
		for(i = 0; i <= x-1; i++) {
			for(j = 0; j <= x-1; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.printf("\n");
		}
		
		

	}

}
