package data_structure;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		//버블 정렬
		int a[] = new int[10];
		int i, j, k, b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		for(b=0; b<=9; b++) {
			a[b] = sc.nextInt();
		}
		
		for(i=1; i<=9; i++) {
			for(j=0; j<9-i; j++) {
				//오름차순
				if(a[j] > a[j+1]) {
					k = a[j];
					a[j] = a[j+1];
					a[j+1] = k;
				}
			}
		}
		
		for(c=0; c<=9; c++) {
			System.out.printf("%d ", a[c]);
		}
		

	}

}
