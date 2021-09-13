package data_structure;

import java.util.Scanner;

public class GetRank2 {

	public static void main(String[] args) {
		//석차 구하기(석차를 배열에 넣지 않고 바로 출력하기)
		//두 점수를 입력받아 합계를 낸 후 등수로 출력하기
		int i, j, rank = 1;
		int a[] = new int[5];
		int b[] = new int[5];
		int sum[] = new int[5];	
		
		for(int x=0; x<=4; x++) {
			System.out.print("두 점수 입력(두 점수 입력 후 엔터):");
			Scanner sc = new Scanner(System.in);
			a[x] = sc.nextInt();
			b[x] = sc.nextInt();
			sum[x] = a[x] + b[x];
		}
		
		for(i=0; i<=4; i++) {
			if(sum[i] != 0) {
				rank = 1;
				for(j=0; j<=4; j++) {
					if(sum[i] < sum[j]) {
						rank++;
					}
				}
			}
			
			
			System.out.printf("%d %d %d 등수: %d \n", a[i], b[i], sum[i], rank);
		
		}
		
		
		
		
	}

}
