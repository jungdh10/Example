
public class Add_Sub_Fraction {

	public static void main(String[] args) {
		//-(1/2)+(2/3)-(3/4)+(4/5)-(5/6)...-(99/100)
		float i, j=0;
		
		for(i=1;i<=5;i++) {
			// if((int)(i/2)==i/2) 짝수라면
			if((int)i%2 ==0) {
				j += i/(i+1);
			}else {
				j -= i /(i+1);
			}
			
		}
		
		System.out.println(j);
	}

}
