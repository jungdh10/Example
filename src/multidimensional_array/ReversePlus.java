package multidimensional_array;

public class ReversePlus {

	public static void main(String[] args) {
		//역순으로 숫자 더하기
		int[] a = {1, 2, 3, 4, 5};
		int[] b = new int[5];
		int mok, nmg;
		
		for(int i=4; i>=0; i--) {
			mok = a[i] / 10;
			nmg = a[i] % 10;
			a[i] = nmg;
			System.out.print(a[i]);
			
		}
		
		
	}

}
