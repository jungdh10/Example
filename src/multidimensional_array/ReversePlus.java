package multidimensional_array;

public class ReversePlus {

	public static void main(String[] args) {
		//역순으로 숫자 더하기
		int[] a = new int[5];
		int x = 12345;
		int i, mok, nmg;
				
		for(i=0; i<=4; i++) {
			mok = x / 10; 
			nmg = x % 10; 
			a[i] = nmg;	
			//역순
			x = mok;
			System.out.print(a[i]);
		}
		
		
		
	}

}
