import java.util.Scanner;

public class Complement_5 {

	public static void main(String[] args) {
		//보수의 보수 구하기(구한 2의 보수를-> 1의 보수-> 원래의 이진수로 만들기)
		int i, j;
		int a[] = new int[5];
		int b[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2진수 입력:");
		for(i=0; i<=4; i++) {
			a[i] = sc.nextInt();
		}
		
		j=1;
		
		for(i=4; i>=0; i--) {
			b[i] = a[i] -j;
			if(a[i] ==0 && j == 1) {
				j=1;
			}else {
				j=0;
			}
			//절대값
			b[i] = Math.abs(b[i]);
		}
		
		
		//1의 보수 구하기
		for(i=0; i<=4; i++) {
			b[i] = 1 - b[i];
		}
		
		//입력한 2의 보수
		for(int k=0; k<=4; k++) {
			System.out.printf("%d", a[k]);
		}
		System.out.print("\n");
		//입력한 2의 보수-> 1의 보수-> 원래 2진수
		for(int k=0; k<=4; k++) {
			System.out.printf("%d", b[k]);
		}
		

		

	}

}
