package data_structure;

import java.util.Scanner;

public class GetRank {

	public static void main(String[] args) {
		//석차 구하기
		int n, i, j;
		int jumsu[] = new int[5];
		int rank[] = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		for(int m=0; m<=4; m++) {
			jumsu[m] = sc.nextInt();
		}
		
		n=4;
		
		//점수를 비교하기 전에 등수를 1등으로 모두 초기화 시킨다.
		for(i=0; i<=n; i++) {
			rank[i] = 1;
		}
		
		 for(i=0; i<=n; i++) {
			 
			 for(j=0; j<=n; j++) {
				 //점수가 더 작으면 rank에 +1을 하여 등수를 낮춘다.
				 if(jumsu[i] < jumsu[j]) {
					 rank[i]++;
				 }
			 }
		 }
		 
		 
		 for(int x=0; x<=4; x++) {
				System.out.printf("%d ", jumsu[x]);			
		 }
		 System.out.printf("\n");
		 for(int x=0; x<=4; x++) {
				System.out.printf("%d ", rank[x]);			
		 }
		
	}

}
