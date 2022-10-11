package multidimensional_array;

import java.util.Scanner;

public class MoneyCalculation {

	public static void main(String[] args) {
		//화폐 종류별 매수 계산하기
		//입력 받은 금액의 각 매수 구하기
		int unit = 50000; 
		int num = 0;
		int sw = 0;
		int m;
		int a[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 입력:");
		m = sc.nextInt();
		System.out.printf("받은 금액:%d\n", m);
		
		
		for(int i=0; i<=9; i++) {
			
			if(sw == 0) {
				num = m/unit;
				a[i] = num;
				m = m % unit;
				unit /= 5;
				sw = 1;
			}else {
				num = m/unit;
				a[i] = num;
				m = m % unit;
				unit /= 2;
				sw = 0;
			}			
			
		}
						
				
		System.out.print("오만  일만  오천  일천  오백  일백  오십  일십   오   일\n");
		for(int aa : a) {
			//왼쪽정렬: -
			System.out.printf("%-5d", aa);
		}
		
		
	}

}
