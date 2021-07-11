
public class Multiple {

	public static void main(String[] args) {
		//1~100까지의 수 중에서 5의 배수의 개스와 합 구하기
		int mok, nmg, i;
		int cnt = 0;
		int sum = 0;
		
		for(i=1; i<=100; i++) {
			mok = i/5;
			nmg = i - mok * 5;
			
			if( i % 5 == 0) {
				cnt++;
				sum += i;
			}
		}
		
		System.out.printf("%d, %d",cnt, sum);

	}

}
