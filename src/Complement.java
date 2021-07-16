import java.util.Scanner;

public class Complement {

	public static void main(String[] args) {
		//1의 보수 구하기
		int i;
		int a[] = new int[5];
	
		Scanner sc = new Scanner(System.in);
		System.out.print("2진수 입력:");
		for(i=0; i<=4; i++) {
			a[i] = sc.nextInt();
			if(a[i] != 0 && a[i] != 1) {
				System.out.print("2진수가 아닙니다.");
			}
		}

		for(i=0; i<=4; i++) {
			
			if(a[i] == 0) {
				a[i] = 1;
			}else {
				a[i] = 0;
			}
			System.out.printf("%d ", a[i]);
		}
		
		
	}

}
