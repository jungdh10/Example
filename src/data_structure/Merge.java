package data_structure;

//병합하기
//(조건) "0"다음의 요소에는 데이터가 없는 것으로 간주한다.
// 배열 A, B를 병합해 배열 C에 기억시킨 후 마지막에 "0"을 기억시킨다.
//중복된 데이터는 한 번만 넣는다.
public class Merge {
	
	//필드
	static int[] a = {2, 3, 5, 8, 9, 10, 12, 13, 0};
	static int[] b = {1, 3, 5, 6, 0};
	static int[] c = new int[20];
	static int i = 0;
	static int j = 0;
	static int k = -1;
	
	
	
	public static void main(String[] args) {
		
		
		while(true){
			
			k++;
			
			if(a[i] < b[j]) {			
				if(a[i] != 0) {
					c[k] = a[i];
				}else {
					k--;
					bMethod(b, c);
				}
				i++;			
			}else if(a[i] == b[j]) {	
				c[k] = a[i];
				i++;
				j++;
				if(a[i] == 0) {
					bMethod(b, c);
				}else if(b[j] == 0) {
					aMethod(a, c);				
				}
			}else {	
				if(b[j] != 0) {
					c[k] = b[j];
				}
				else{
					k--;
					aMethod(a, c);
				}
				j++;
			}			
			
						
			System.out.printf("%d\t", c[k]);
		
			
			
		}
		
		
	
	}
	

	//메소드 선언
	static void aMethod(int[] a, int[] c) {	
		do {
			k++;
			c[k] = a[i];
			i++;
			System.out.printf("%d\t", c[k]);
		}while(a[i] != 0);
		cMethod(c);	
	}
	
	
	static void bMethod(int[] b, int[] c) {		
		do {
			k++;
			c[k] = b[j];
			j++;
			System.out.printf("%d\t", c[k]);
		}while(b[j] != 0);
		cMethod(c);	
	}

	
	static void cMethod(int[] c) {
		k++;
		c[k] = 0;
		System.out.printf("%d\t", c[k]);
		System.exit(0);;
	}
	

}
