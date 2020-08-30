
public class Sum_Sequence {

	public static void main(String[] args) {
		// 0+1+3+6+10+15(1+2+3+4씩 늘어나는)수열의 합
		int i;
		int j=0, x=0;
		
		for(i=0; i<=5; i++) {
			j = i+j;
			x = x+j;
		}

		System.out.println(x);
		
		//1+2+4+7+11+16(6번째 항까지)
		int a;
		int b=1, c=0;
		for(a=0; a<=5; a++) {
			b=a+b;
			c+=b;
		}
		System.out.println(c);
	}

	
}
