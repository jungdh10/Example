package multidimensional_array;

public class Isosceles {

	public static void main(String[] args) {
		//이등변 삼각형 만들기
		int i, j;
		int k = 0;
		int L = 7/2;
		int[][] a = new int[7][4];
		
		
		for(i = 0; i <= 6; i++) {
			
			if(i <= L) {
				for(j = L-i; j <= 3; j++) {
					k++;
					a[i][j] = k;
				}
			}else {
				for(j = i-3; j <= 3; j++) {
					k++;
					a[i][j] = k;

				}
			}
			
		}
		
		
		for(i = 0; i <= 6; i++) {
			for(j = 0; j <= 3; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.printf("\n");
		}

	}

}
