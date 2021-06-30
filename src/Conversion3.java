import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Conversion3 {

	public static void main(String[] args) throws IOException {
		// 2진수 -> 10진수 변환
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("2진수 입력:");
	         String s = br.readLine();
	        System.out.println("10진수 : "+Integer.parseInt(s, 2));
	}
}
