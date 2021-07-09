import java.util.Scanner;

public class Max_Min_Avg {

	public static void main(String[] args) {
		//최대값과 최소값을 제외한 평균 구하기 
		int i, j, min, max, hap, avg;
		int a[] = new int[7];
	
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력(7숫자):");
		for(j=0; j<=6; j++) {
			a[j] = sc.nextInt();
		}
		
		max = a[0];
		min = a[0];
		hap = a[0];
		
		i=0;
		while(i<6){
			i++;
			hap += a[i];
			if(a[i] < min) {
				min = a[i];
			}
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		hap = hap - max - min;
		avg = hap/5;
		System.out.printf("최대값, 최소값, 합계, 평균:%d, %d, %d, %d", max, min, hap, avg);
		
	}

}
