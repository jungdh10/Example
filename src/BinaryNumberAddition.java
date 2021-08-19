import java.util.Scanner;

public class BinaryNumberAddition {

	public static void main(String[] args) {
		// 두 이진수 더하기
		int i, j;
		//자리올림수 발생 여부를 판단하는 변수
		int z = 0;
		//자리올림수가 저장될 변수
		int c = 0;
		int x[] = new int[5];
		int y[] = new int[5];
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 이진수 입력:");
		for(i=0; i<=4; i++) {
			x[i] = sc.nextInt();
		}
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("두 번째 이진수 입력:");
		for(i=0; i<=4; i++) {
			y[i] = sc1.nextInt();
		}
		//배열의 위치 변수
		j=4;
		
		do {
			z = x[j] + y[j] + c;
			if(z < 2){
				c = 0;
				a[j] = z;
			}else {
				//두 이진수와 자리올림수까지의 합이 1+1+1 =3일 경우 3-2를 합니다.
				c = 1;
				a[j] = z - 2;
			}
			j--;
		}while(j>=0);
		
		if(c == 0) {
			do {
				j++;
				System.out.printf("%d", a[j]);				
			}while(j<4);
		}else {
			System.out.print("OVERFLOW");
		}

	}

}
