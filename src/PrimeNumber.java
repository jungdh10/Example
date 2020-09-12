import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//소수 판별하기
		int i;
		int j;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소수인지 확인할 숫자를 입력:");
		i = sc.nextInt();
		
		for(j=2; j<=i-1; j++) {
			
			if(i%j==0) {
				System.out.println("소수가 아닙니다.");
				break;
			}else {
				System.out.println("소수 입니다.");
				break;
			}
		}

	}

}
