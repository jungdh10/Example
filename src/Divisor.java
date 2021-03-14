import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		//약수 구하기
	int b, mok, nmg, i;
	int a[] = new int[100];
	
	Scanner sc = new Scanner(System.in);
	System.out.print("약수를 구할 숫자:");
	b = sc.nextInt();
	
	int c=0, d=-1;
	
	while(true) {
		c++;
		if(c <= b) {
			mok = b/c;
			nmg = b-mok*c;
			if(nmg == 0) {
				d++;
				a[d] = c;
			}
		}else {
			System.out.println(b);
			for(i=0; i<=d; i++) {
				System.out.println(a[i]);
			}
			break;
				
		}
	}

	}

}
