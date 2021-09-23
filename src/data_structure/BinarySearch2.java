package data_structure;

import java.util.Scanner;

public class BinarySearch2 {

	public static void main(String[] args) {
		//2차원 배열을 이용해 번호에 맞는 점수 찾기(이분 검색방법)
		int i, start, end, mid;
		int a[][] = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 
				{90, 85, 65, 70, 95, 100, 60, 80, 75, 55}};
		start = 0;
		end = 9;
		
		System.out.print("숫자 입력:");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		
while(true) {
			
			if(start <= end) {
				mid = (start+end)/2;
				
				if(i == a[0][mid]) {
					System.out.printf("입력한 숫자: %d, 점수: %d\n", i, a[1][mid]);
					break;
				}
				
				if( i < a[0][mid]) {
					end = mid-1;
				}else {
					start = mid+1;
				}	
				
			}else {
				System.out.printf("%d는 없습니다.", i);
				break;
			}
			
			
			
		}
		
		
		

	}

}
