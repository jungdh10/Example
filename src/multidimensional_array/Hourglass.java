package multidimensional_array;

public class Hourglass {

	public static void main(String[] args) {
		//모래시계 모양으로 데이터 채우기
		int i, j;
		int s = 0, e = 4;
		int k = 0;
		int[][] a = new int[5][5];
		
		for(i = 0; i <= 4; i++) {
			
			for(j = s; j <= e; j++) {
				k++;
				a[i][j] = k;
			}
			
			if(i >= 2) {
				s--;
				e++;
			}else {
				s++;
				e--;
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
