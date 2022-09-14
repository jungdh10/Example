package multidimensional_array;

public class Tornado {

	public static void main(String[] args) {
		//회오리 모양으로 데이터 채우기
		int n;
		int i = 0;
		int j = -1;
		int k = 0;
		int s = 1;
		int f = 5;
		int[][] a = new int[5][5];
		
		while(true) {
			
			for(n = 1; n <= f; n++) {
				k++;
				j = j + s;
				a[i][j] = k;
			}
			f--;
			if(f <= 0)
				break;
		
			
			for(n=1; n <= f; n++) {
				k++;
				i += s;
				a[i][j] = k;
			}
			s = s*-1;
		}
		
		
		
		
		
		
		
		
		for(i = 0; i <= 4; i++) {
			for(j = 0; j <= 4; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.printf("\n");
		}

	}

}
