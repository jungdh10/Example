
public class Sum_Sequence2 {

	public static void main(String[] args) {
		// -1+2-4+7-11+16 계산하기
		int i=0;
		int j=1;
		int s=-1;
		int x=-1;
		
		for(i=1; i<=5; i++) {
			s*=-1;
			j+=i;
			x+=j*s;
	
			System.out.println(x);
		}
		
		/* do-while
		do {
			i++;
			j+=i;	
			s*=-1;
			x+=j*s;
			System.out.println(x);
		}while(i<5);
		*/

	}
}
