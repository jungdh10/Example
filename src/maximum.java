import java.util.Scanner;

public class maximum {

	public static void main(String[] args) {
		//최대값 구하기
		int i;
		int a[] = new int[5];
		int max = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력:");
		for(int j=0; j<=4; j++) {
			a[j] = sc.nextInt();
		}
		
		for(i=0; i<=4; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		
		System.out.print(max);
		
	}

}
