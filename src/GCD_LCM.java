import java.util.Scanner;

public class GCD_LCM {

	public static void main(String[] args) {
		// 최대공약수, 최대공배수 구하기
		int a, b, big, small, mok, nmg, gcd, lcm;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a >= b) {
			big = a;
			small = b;
		}else {
			big = b;
			small = a;
		}
		
		while(true){
			mok = big / small;
			nmg = big - mok * small;
			if(nmg == 0) {
				gcd = small;
				lcm = a * b / gcd;
				System.out.println("최대공약수:" + gcd);
				System.out.println("최소공배수:" + lcm);
				break;
			}
			big = small; 
			small = nmg;
		}

	}

}
