package multidimensional_array;

public class Basic3 {

	public static void main(String[] args) {
		// "ㄹ"자로 데이터 채우기
		int i, j;
		j = 0;
		int k = 0;
		int a[][] = new int[5][5];
		
		for(i = 0; i <= 4; i++) {
			
			if(j <= 0) {
				for(j = 0; j <= 4; j++) {
					k++;
					a[i][j] = k;
				}		
			}else {
				for(j = 4; j >= 0; j--) {
					k++;
					a[i][j] = k;
				}
				
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
