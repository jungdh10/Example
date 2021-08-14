import java.util.Scanner;

public class NumberAddition {

	public static void main(String[] args) {
		//큰 십진수 더하기(12자리로 구성된 십진수들 계산하기)
		//배열의 첫 번째요소로 0을 입력 받으면 계산 후 결과를 출력하고 프로그램을 종료
		int i, j, mok, nmg;
		int a[] = new int[12];
		int b[] = new int[14];
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("입력:");
			for(i=0; i<=11; i++) {
				a[i] = sc.nextInt();
			}
			
			//a[0] == 0 이면 입력을 모두 마친 것
			//b[i+2]의 1, 2번째는 자리올림이 발생했을 경우를 대비
			if(a[0] == 0) {
				break;
			}else {
				for(i=0; i<=11; i++) {
					b[i+2] += a[i];
				}
			}
		}

		for(i=13; i>=1; i--) {
			mok = b[i] / 10;
			nmg = b[i] - mok * 10;
			b[i] = nmg;
			b[i-1] += mok;
		}
		
		//첫 번째 자리까지 자리올림이 발생했는지 판단(자리올림이 발생하면 첫 번째 자리부터 출력)
		if(b[0] == 0) {
			j = 1;
		}else {
			j = 0;
		}
		
		for(i=j; i<=13; i++) {
			System.out.printf("%d", b[i]);
		}
		
	}

}
