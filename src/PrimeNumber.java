import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//소수 판별하기
		int i;
		int j;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소수인지 확인할 숫자 입력:");
		i = sc.nextInt();		
		
		
		j=2;
		while(i%j != 0)
			j++;
		
			if(i==j) {
				System.out.println("소수 입니다.");
			}else {
				System.out.println("소수가 아닙니다.");
			}

	}

}
