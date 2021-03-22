import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// 10진수를 2진수로 변환
		int b, bb, c, mok, nmg, i;
		int a[] = new int[100];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		b = sc.nextInt();
		
		bb=b;
		c=-1;
		
		do {
			c++;
			mok=b/2;
			nmg=b-mok*2;
			a[c]=nmg;
			b=mok;
		}while(mok != 0);
		
		for(i=c; i>=0; i--) {
			System.out.println(a[i]);
		}

	}

}
