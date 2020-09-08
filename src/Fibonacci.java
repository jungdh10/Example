
public class Fibonacci {

	public static void main(String[] args) {
		// 피보나치 수열의 합계(1+1+2+3+5+8+...)
		int a=1, b=1;
		int c;
		//첫 번째, 두 번째 항은 이미 계산 했다는 것을 염두
		int hap=2, cnt=2;
		
		//cnt 역시 첫 번째, 두번째 항은 계산 되었으니 3부터 시작
		for(cnt=3; cnt<=6; cnt++) {
			c=a+b;
			hap=hap+c;
			a=b;
			b=c;
			
			
			System.out.println(hap);
		}

	}

}
