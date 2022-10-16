package multidimensional_array;

public class MultiplicationTable {

	public static void main(String[] args) {
		//구구단		
		int i, j, x;
		
		for(i=1; i<=9; i++) {
			for(j=1; j<=9; j++) {
				x = i*j;
				System.out.printf("%d X %d = %d\n", i, j, x);
			}
			System.out.println();
		}
		
		
		

	}

}
