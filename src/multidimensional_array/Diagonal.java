package multidimensional_array;

public class Diagonal {

	public static void main(String[] args) {
		//대각선으로 데이터 채우기
		int i = 0;;
		int j = 0;
		int k = 0;
		int n = 0;
		int a[][] = new int[5][5];
		
		
		for(n = 0; n <= 8; n++) {
			for(i = 0; i <= 4; i++) {
				j = n - i;
				if(j < 0) continue;
				if(j > 4) continue;
				
				k++;
				a[i][j] = k;
			}
		}
		

		for(i = 0; i <= 4; i++) {
			for(j = 0; j <= 4; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.printf("\n");
		}
		
	}

}
