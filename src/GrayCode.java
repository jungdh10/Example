import java.util.Scanner;

public class GrayCode {

	public static void main(String[] args) {
		//그래이코드와 이진수로 변환하기(XOR)
		//첫 번째 입력 받은 수가 0이면 그레이코드로 변환, 1이면 2진수로 변환한다.
		//2진수-> 그레이, 그레이-> 2진수로 변환 시 첫 번째 비트는 그대로 옮겨진다.
		int i;
		int a[] = new int[5];
		int b[] = new int[4];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		for(i=0; i<=4; i++) {
			a[i] = sc.nextInt();
		}
		
		//그레이-> 2진수
		b[0] = a[1];
		if(a[0] == 1) {
			for(i=0; i<=2; i++) {
				if(a[i+2] == b[i]) {
					b[i+1] = 0;
				}else {
					b[i+1] = 1;
				}
			}
			//2진수-> 그레이
		}else {
			for(i=0; i<=2; i++) {
				if(a[i+1] == a[i+2]) {
					b[i+1] = 0;
				}else {
					b[i+1] = 1;
				}
			}
		}
		
		if(a[0] == 1) {
			System.out.print("이진수");
		}else {
			System.out.print("그레이코드");
		}
		
		for(i=0; i<=3; i++) {
			System.out.printf("%d", b[i]);
		}
	

	}

}
