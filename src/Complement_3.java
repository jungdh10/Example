import java.util.Scanner;

public class Complement_3 {

	public static void main(String[] args) {
		//1의 보수를 구한 후 2의 보수 구하기
		int a[] = new int[5];
		int b1[] = new int[5];
		int b2[] = new int[5];
		int i;
		int c = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2진수 입력:");
		for(i=0; i<=4; i++) {
			a[i] = sc.nextInt();
			b1[i] = 1 - a[i];
		}
			
		for(i=4; i>=0; i--) {
			b2[i] = b1[i] + c;
			b2[i] = b2[i] % 2;
			c = b1[i] * c;
		}
		
		
		for(int k=0; k<5; k++) {
			System.out.printf("%d", a[k]);
		}
		System.out.printf("\n");
		for(int k=0; k<5; k++) {
			System.out.printf("%d", b1[k]);
		}
		System.out.printf("\n");
		for(int k=0; k<5; k++) {
			System.out.printf("%d", b2[k]);
		}
		
		
		
		

	}

}
