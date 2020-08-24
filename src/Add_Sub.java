
public class Add_Sub {

	public static void main(String[] args) {
		//덧셈 뺼셈 번갈아 계산하기(1-2+3-4+5-6+7...)
		int i, j =0;
		
		for(i=1;i<=100;i++) {
			if( i%2 == 1) {
				j += i;
			}else {
				j -= i;
			}
			
		}
		
		System.out.println(j);
	}

}
