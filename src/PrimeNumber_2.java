import java.util.Scanner;

public class PrimeNumber_2 {

	public static void main(String[] args) {
		//소수 판별하기
		//소수를 판별할 숫자 i를 2부터 차례로 나누어서 처음으로 나누어 떨어졌을 때 i와 제수가 같으면 소수이다.
		//while(true) 사용
		int a, i, j;
				
		Scanner sc = new Scanner(System.in);
		System.out.print("소수인지 확인할 숫자 입력:");
		a = sc.nextInt();	
		i=a-1;
		j=2;
		
		while(true) { 
				
			if(j<=i) {
				if(a%j == 0) {
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
