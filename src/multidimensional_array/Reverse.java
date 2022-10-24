package multidimensional_array;

public class Reverse {

	public static void main(String[] args) {
		//숫자의 좌우 위치 변경하기
		int i, j, x, y;
		int[] a = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
		
		i=0;
		while(a[i] != 0) {
			i++;
		}
		//끝 자리, 첫 번째 자리
		j = i-1;
		i=0;
		
		x = j/2;
		
		for(i=0; i<=x; i++) {
			y = a[i];
			a[i] = a[j];
			a[j] = y;
			j--;
		
		}		
		
		for(i=0; i<=9; i++) {
			System.out.printf("%3d", a[i]);
			
		}

		
	}

}
