package multidimensional_array;

public class Basic5 {

	public static void main(String[] args) {
		//"ㄹ"자로 데이터 채우기(자료교환)
		int i, j, z;
		int k = 0;
		int n = 1;
		//열의 시작 위치, 끝 위치
		int f = 0;
		int e = 4;
		int a[][] = new int[5][5];
		
		
		for(i = 0; i <= 4; i++) {		
			for(j = f; j != e+n; j += n) {
				k++;
				a[i][j] = k;
			}			
			z = f;
			f = e;
			e = z;
			n *= -1;
						
		}
		
		
		
		for(i = 0; i <= 4; i++) {
			for(j = 0; j <= 4; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.printf("\n");
		}
		
		

	}

}
