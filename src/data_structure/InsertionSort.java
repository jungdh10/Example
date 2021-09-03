package data_structure;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		//삽입 정렬
		int a[] = new int[5];
		int i, j, key;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		for(int b=0; b<=4; b++) {
			a[b] = sc.nextInt();
		}
		
		for(i=1; i<=4; i++) {
			key = a[i];
			
			for(j=i-1; j>=0; j--) {
				if(a[j] > key) {
					a[j+1] = a[j];
				}else {
					break;
				}
			}
			
			a[j+1] = key;
		}
		
		for(int c=0; c<=4; c++) {
			System.out.printf("%d ", a[c]);
		}

	}

}
