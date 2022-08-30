package multidimensional_array;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		//오른쪽 삼각형 모양
		int i, j, middle, k;
		int[][] a;
		a = new int[10][10];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 입력(10이하):");
		int x = sc.nextInt();
		
		k = 0;
		middle = x/2;
		
		
		for(i = 0; i <= x-1; i++) {
			
			
			if(i <= middle) {
				for(j = 0; j <= x-i-1; j++) {
					k++;
					a[i][j] = k;
				}
			}else {
				for(j = 0; j <= i; j++) {
					k++;
					a[i][j] = k;
				}
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
