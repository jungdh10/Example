import java.util.Scanner;

public class Complement_2 {

	public static void main(String[] args) {
		//1의 보수 구하기(1에서 변환할 값을 빼는 방법)
		int i;
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이진수 입력:");
		for(i=0; i<=4; i++){
			a[i] = sc.nextInt();
		}
		
		for(i=0; i<=4; i++){
			a[i] = 1 - a[i];
			System.out.printf("%d ",a[i]);
		}		

	}

}
