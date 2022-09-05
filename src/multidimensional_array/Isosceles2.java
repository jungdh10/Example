package multidimensional_array;

import java.util.Scanner;

public class Isosceles2 {

	public static void main(String[] args) {
		//이등변 삼각형 만들기(행과열 입력받기)
		int i, j, x, y, start, end;
		Scanner sc = new Scanner(System.in);
		System.out.print("열의 크기 입력:");
		y = sc.nextInt();
		x = y*2-1;
		int k = 0;	
		int[][] a = new int[x][y];
		
		
		for(j = 0; j <= y-1; j++) {
			
			start = y - (j+1);
			
			end = (j-1) + y;
			
			for(i = start; i <= end; i++) {
				k++;
				a[i][j] = k;
			}
			
			
			
		}

		
		
		for(i = 0; i <= x-1; i++) {
			for(j = 0; j <= y-1; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
