package multidimensional_array;

public class Basic {

	public static void main(String[] args) {
		//기본 5행 5열에 데이터 채우기
		int i, j;
		int k = 0;
		int a[][] = new int[5][5];
		
		for(i = 0; i <= 4; i++) {
			for(j = 0; j<= 4; j++) {
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
