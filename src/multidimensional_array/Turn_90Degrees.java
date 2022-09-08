package multidimensional_array;

public class Turn_90Degrees {

	public static void main(String[] args) {
		//90도 회전하기
		int i, j;
		int k = 0;
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		
		
		for(i=0; i<=4; i++) {
			for(j=i; j<=4; j++) {
				k++;
				a[i][j] = k;
			}
		}
		
		//b배열에 옮기기
		for(i=0; i<=4; i++) {
			for(j=0; j<=4; j++) {
				b[j][4-i] = a[i][j];
			}
		}
		
		
	
		//출력하기		
		for(i = 0; i <= 4; i++) {
			for(j = 0; j <= 4; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.printf("\n");
		}

		System.out.printf("\n");
		
		for(i = 0; i <= 4; i++) {
			for(j = 0; j <= 4; j++) {
				System.out.printf("%3d", b[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
