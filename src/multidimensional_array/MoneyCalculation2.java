package multidimensional_array;

import java.util.Scanner;

public class MoneyCalculation2 {

	public static void main(String[] args) {
		//화폐 매수 구하기
		//입력 받은 금액의 각 매수 구하기
			int unit = 50000; 
			//매수
			int num = 0;
			int sw = 0;
			//입력금액, 남은금액
			int m;
			int a[] = new int[10];
			
			Scanner sc = new Scanner(System.in);
			System.out.print("금액 입력:");
			m = sc.nextInt();
			System.out.printf("받은 금액:%d\n", m);

			
			int i = 0;
			while(true) {
				num = m/unit;
				a[i] = num;
				m = m % unit;
				i++;
				
				if(sw == 0) {
					unit /= 5;
					sw = 1;
				}else{
					unit /= 2;
					sw = 0;
				}
				
				if(i >= 9) {
					break;
				}
				
			}
		
			
			System.out.print("오만  일만  오천  일천  오백  일백  오십  일십   오   일\n");
			for(int j=0; j<=9; j++) {
				System.out.printf("%-5d", a[j]);
			}

	}

}
