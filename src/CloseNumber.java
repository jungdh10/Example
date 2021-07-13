import java.util.Scanner;

public class CloseNumber {

	public static void main(String[] args) {
		//7에 가장 가까운 수 구하기(입력하는 데이터는 1자리 정수이며 근사값이 2개인 경우에는 나중에 찾은 값을 출력)
		//j는 해당 자릿수애서 나올 수 이쓴 가장 큰 값으로 초기화
		int i, j, k, l, m = 0;
		int a[] = new int[10];
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력:");
		for(i=0; i<=9; i++) {
			a[i] = sc.nextInt();
		}
		
		j = 9;
		
		for(k=0; k<=9; k++){
			if(a[k] >= 7){
				l = a[k] - 7;
			}else {
				l = 7 - a[k];
			}
			
			if(l <= j) {
				j = l;
				m = a[k];
			}
		}
		System.out.print(m);

	}

}
