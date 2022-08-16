package multidimensional_array;

public class Basic4 {

	public static void main(String[] args) {
		//"ㄹ"자로 데이터 채우기 - 토글
		int i = 0;
		int j = 0;
		int k = 0;
		int sw = 1;
		int a[][] = new int[5][5];
		
		
		
		for(i = 0; i <= 4; i++) {
				
			
			if(sw == 1) {
				for(j = 0; j <= 4; j++){
					k++;
					a[i][j] = k;
					sw *= -1;
				}
			}else if(sw == -1){
				for(j = 4; j >= 0; j--){
					k++;
					a[i][j] = k;						
					sw *= -1;
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
