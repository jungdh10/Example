package multidimensional_array;

import java.util.Scanner;

public class Hourglass2 {

	public static void main(String[] args) {
		//모래시계 모양으로 데이터 채우기(배열의 크기는 입력받기)
		int i, j, middle, L;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 입력(10이하):");
		int end = sc.nextInt();
	
		
		int k = 0;
		int[][] a;
		//배열 변수는 배열을 생성하고 참조하는 상태에서 값을 저장하거나 읽어야하기 때문에 NullPointerException 발생
		//a = null;
		a = new int[10][10];
		
		L = end;
		middle = end/2;
		
		for(i = 0; i <= middle; i++) {
			L--;
			for(j = i; j <= L; j++) {
				k++;
				a[i][j] = k;
			}
		}
		
		
		
		for(i = middle+1; i <= end-1; i++) {
			L--;
			for(j = L; j <= i; j++) {
				k++;
				a[i][j] = k;
			}
		}
		
		
		
		for(i = 0; i <= end-1; i++) {
			for(j = 0; j <= end-1; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.printf("\n");
		}

	}

}
