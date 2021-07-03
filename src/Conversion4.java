import java.util.Scanner;

public class Conversion4 {

	public static void main(String[] args) {
		// 2 -> 10진수로 변환
		//10자리 입력받은 이진수 중 5번째 자리까지는 소수 이상, 6~10번째 자리까지는 소수 이하이다.
		int[] a = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력:");
		for (int i = 0; i <= 9; i++) {
		a[i] = sc.nextInt();
		}
		
		double d;
		double b = 0;
		int c = -1;
		
		while(true) {
			c++;
			if( c <= 9) {
				d = a[c]*Math.pow(2, 4-c);
				b += d;	
			}else {
				System.out.printf("%8.5f", b);
				break;
			}
		}
		
		
	}

}
