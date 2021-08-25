package data_structure;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// 선택 정렬
		int i, j, k, b, c;
		int a[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		for(b=0; b<=9; b++) {
			a[b] = sc.nextInt();
		}
		
		for(i=0; i<=8; i++) {
			for(j=i+1; j<=9; j++) {
				//내림차순
				if(a[i] < a[j]) {
					k = a[i];
					a[i] = a[j];
					a[j] = k;
				}
			}
		}
		
		for(c=0; c<=9; c++) {
			System.out.printf("%d ", a[c]);
		}

	}

}
