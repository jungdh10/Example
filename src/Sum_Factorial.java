
public class Sum_Factorial {

	public static void main(String[] args) {
		// 1!+2!+3!+4!+5!+...10!의 합계
		//전 항에 곱하기 새로 증가된 숫자
		//j*=i; 때문에 i,j는 1부터 시작
		int i=1;
		int j=1;
		int x=0;
			
		for(i=1; i<=10; i++) {
			j*=i;		
			x+=j;
			
			System.out.println(x);
		}

	}

}
