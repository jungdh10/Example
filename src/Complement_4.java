
public class Complement_4 {

	public static void main(String[] args) {
		//2의 보수 구하기(1이 나올 때까지만 그대로, 나머지는 반대로 쓰는 방법)
		int i, j;
		int a[] = {0, 1, 0, 1, 0};
		int b[] = new int[5];
		
		for(i=4; i>=0; i--) {
			if(a[i] ==  1) {
				break;
			}
			b[i] = a[i];
			
		}
		b[i] = a[i];
		for(j=i-1; j>=0; j--) {
			b[j] = 1 - a[j];
		}
		for(int k=0; k<5; k++) {
			System.out.printf("%d", a[k]);
		}
		System.out.print(" ");
		for(int k=0; k<5; k++) {
			System.out.printf("%d", b[k]);
		}

	}

}
