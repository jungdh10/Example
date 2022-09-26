package multidimensional_array;

import java.util.Scanner;

public class MatrixTransformation {

	public static void main(String[] args) {
		//행렬 변환
		int i, j, o, p;
		int k = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 입력:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int[][] a = new int[row][col];
		int[][] b = new int[col][row];

		
		for(i = 0; i <= row-1; i++) {
			for(j = 0; j<= col-1; j++) {
				k++;
				a[i][j] = k;
			}
		}
		
		
		
		o = 0;
		p = -1;
		
		for(i = 0; i <= row-1; i++) {
			for(j = 0; j <= col-1; j++) {
				
				p += 1;
				b[o][p] = a[i][j];
				
				if(p >= row-1) {
					o++;
					p = -1;
				}
				
				
			}
		}
		
		
		
		for(int x = 0; x < col; x++) {
			for(int y = 0; y < row; y++) {
				System.out.printf("%3d", b[x][y]);
			}
			System.out.printf("\n");
		}
		
		
		
		
	}

}
