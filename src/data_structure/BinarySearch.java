package data_structure;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		//이분 검색(입력한 값이 배열의 몇 번째에 있는지 출력하기)
		int i, start, end, mid;
		int a[] = {5, 13, 24, 35, 47, 65, 74, 86, 93, 99};
		start = 0;
		end = 9;
		
		System.out.print("숫자 입력:");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		
		while(true) {
			
			if(start <= end) {
				mid = (start+end)/2;
				
				if(i == a[mid]) {
					System.out.printf("입력한 값: %d, 배열의 위치: %d", i, mid+1);
					break;
				}
				
				if( i < a[mid]) {
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
