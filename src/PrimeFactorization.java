import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		//소인수 분해하기
		int b, c, d, e, mok = 0, nmg;
		int a[] = new int[100];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해를 구할 숫자:");
		b = sc.nextInt();
		
		c=-1;
		d=2;
		
		while(true) {
			e=(int)Math.sqrt(b);
			
			while(true) {
				if(d>e) {
					d=b;
					break;
				}
				mok=b/d;
				nmg=b-mok*d;
				if(nmg==0) {
					break;
				}else {
					d++;
				}
			}
			
			c++;
			a[c]=d;
			if(b==d) {
				break;
			}
			b=mok;
			
		}
		
		for(int i=0; i <=c; i++) {
			System.out.println(a[i]);
			
		}
		
	}
	
}


