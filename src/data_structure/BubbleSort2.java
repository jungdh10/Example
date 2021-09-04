package data_structure;

import java.util.Scanner;

public class BubbleSort2 {

	public static void main(String[] args) {
		//버블 정렬 - 좌우로 번갈아 가면서 정렬하기
		int a[] = new int[10];
		int i, shift = 0, left, right, k;
		
		left = 0;
		right = 9;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		for(int b=0; b<=9; b++) {
			a[b] = sc.nextInt();
		}
		
		while(left < right) {
			//좌 -> 우 방향
			for(i=left; i<=right-1; i++) {
				if(a[i] > a[i+1]) {
					k = a[i];
					a[i] = a[i+1];
					a[i+1] = k;
					shift = i;
				}
			}
			//다음 정렬의 시작 위치를 지정(다음 정렬의 시작위치는 마지막으로 교환된 시점부터)
			right = shift;
			
			//우 -> 좌 방향
			for(i=right; i>=left+1; i--) {
				if(a[i-1] > a[i]) {
					k = a[i-1];
					a[i-1] =a[i];
					a[i] = k;
					//현재위치 shift에 저장
					shift = i;
				}
			}
			left = shift;
			
		}
		
		for(int c=0; c<=9; c++) {
			System.out.printf("%d ", a[c]);
		}

	}

}
