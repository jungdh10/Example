import java.util.Scanner;

public class PrimeNumber_Sum {

	public static void main(String[] args) {
		//소수의 합 구하기
		int a;
		int i;
		int j;
		int x=0;
	
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력:");
		a = sc.nextInt();
		
		for(i=2; i<=a; i++) {			
			//소수 판별하기
			for(j=2; j<i; j++) {
								
				//소수가 아닌 경우
				if(i%j == 0) {	
					break;
				}					
				
			}
			
			//소수로 판별이 난 경우
			if(i==j) {
			System.out.println(j);
			x+=j;
			}
					
		}		
		System.out.println("입력한 숫자의 범위에 속하는 모든 소수의 합은" +x+ "입니다.");
	}

}
