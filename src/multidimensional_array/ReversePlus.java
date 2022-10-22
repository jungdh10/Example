package multidimensional_array;

import java.util.Scanner;

public class ReversePlus {

	public static void main(String[] args) {
		//역순으로 숫자 더하기
		int[] a = new int[5];
		int i, mok, nmg, hap;
		int m = 0;
			
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("5자리 숫자 입력:");
			int x = sc.nextInt();
			
			if(x == 00000) {
				break;
			}
					
			int k = x;
			for(i=0; i<=4; i++) {
				mok = x / 10; 
				nmg = x % 10; 
				a[i] = nmg;	
				//역순
				x = mok;				
			}
		
			
			//역순의 숫자 앞자리가 0일 경우를 대비
			for(i=0; i<=4; i++) {
				if(a[i] != 0) {
					break;
				}
			}			
	
			//역순의 배열을 X10하여 숫자로 나타내기
			for(int j=i; j<=3; j++) {
				m += a[j];
				m *= 10;
			}
			m = m + a[4];
	
			
			hap = k + m;
			System.out.printf("%d %d %d\n", k, m, hap);			
		}
	
		
	}

}
