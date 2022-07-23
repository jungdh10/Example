package data_structure;

//병합하기
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
				c[k] = a[i];
				i++;
				if(a[i] == 0) {
					bMethod(b, c);
				}
			}else if(a[i] == b[j]) {
				c[k] = a[i];
				i++;
				j++;
				if(a[i] == 0 ) {
					bMethod(b, c);
				}else if(b[j] == 0) {
					aMethod(a, c);
				}
			}else {
				c[k] = b[j];
				j++;
				if(b[j] == 0) {
					aMethod(a, c);
				}
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
		}while(a[i] != 0);
		cMethod(c);
	
	}
	

	static void bMethod(int[] b, int[] c) {
		do {
			k++;
			c[k] = b[j];
			j++;
		}while(b[j] != 0);
		cMethod(c);
	}

	
	static void cMethod(int[] c) {
		k++;
		c[k] = 0;
		System.exit(0);;
	}

	
	
}

