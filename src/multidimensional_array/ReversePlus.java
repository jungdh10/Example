package multidimensional_array;

public class ReversePlus {

	public static void main(String[] args) {
		//역순으로 숫자 더하기
		int[] a = new int[5];
		int x = 12345;
		int i, mok, nmg, hap;
		int m = 0;
		int k = x;
		
		
		for(i=0; i<=4; i++) {
			mok = x / 10; 
			nmg = x % 10; 
			a[i] = nmg;	
			//역순
			x = mok;
			
		}
		
		
		for(int j=0; j<=4; j++) {
			m += a[j];
			//1의 자리에는 10을 곱하지 않도록 하기
			if(j <= 3) {
				m *= 10;
			}

		}
		
		
		hap = k + m;
		System.out.printf("%d + %d = %d\n", k, m, hap);
		
		
		
	}

}
