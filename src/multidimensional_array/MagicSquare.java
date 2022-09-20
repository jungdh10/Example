package multidimensional_array;

public class MagicSquare {

	public static void main(String[] args) {
		//마방진 
		//1. (0,2)에서 시작해서 대각선으로 행 감소, 열 증가
		//2. 행이 0보다 작으면 행은 4, 열이 4보다 크면 열은 0
		//3. k가 5의 배수+1라면 행의 위치를 +1 
		int i = 0; 
		int j = 5/2;
		int k;
		int[][] a = new int[5][5];
		
		for(k = 1; k <= 25; k++) {
			a[i][j] = k;
						
			if(k % 5 == 0) {
				i++;
				continue;
			}
			
			i--;
			j++;
			if(i < 0) {
				i = 4;
			}
			
			if (j > 4) {
				j = 0;
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
