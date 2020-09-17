import java.util.Scanner;

public class PrimeNumber_Sum {

	public static void main(String[] args) {
		//소수의 합 구하기
		int i;
		int j;
		int x=2;
		int y;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력:");
		i = sc.nextInt();
		
		for(j=2; j<=i; j++) {
			
			for(y=2; y<=j; y++){
				
				if(j%y != 0) {
					x+=j;
					break;
				}else {
					break;
				}
		
			}
			
			System.out.println(x);
						
		}
		System.out.println("입력한 숫자의 범위에 속하는 모든 소수의 합은" +x+ "입니다.");

	}

}
