import java.util.Scanner;

public class PrimeNumber_3 {

	public static void main(String[] args) {
		// i를 2부터 i의 제곱근까지의 숫자로 나눠 떨어지는지 검사하여 한 개의 수에 대해서라도 나눠 떨어지면 소수가 아닌 것을 이용
		int i, j;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소수인지 확인할 숫자 입력:");
		i = sc.nextInt();	
		
		j=2;
		while(true) {
			
			if(j <= Math.sqrt(i)) {
				if(i % j ==0) {
					System.out.println("소수가 아닙니다.");
					break;
				}else {
					j++;
				}
			}else {
				System.out.println("소수 입니다.");
				break;
			}
		}

	}

}
