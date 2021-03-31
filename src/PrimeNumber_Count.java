public class PrimeNumber_Count {

	public static void main(String[] args) {
		
		//소수의 개수 구하기
		int a[] = new int[99];
		int i=0;
		int count=0;
		int m, j;
		

		for(i=0; i<=98; i++){
			a[i] = i+2;
		}

		
		for(i=0; i<=98; i++){
			m = a[i];

			if(m != 0){
				j=2;
				while((m*j)-2 < 99){
				a[(m*j)-2] = 0;
				j++;
				}
				
			}
			
		}

		
		for(i=0; i<=98; i++){
			if(a[i] != 0){
				count++;
			}
		}

		System.out.println("1~100까지의 소수의 개수: "+count+"개");

	}
}

