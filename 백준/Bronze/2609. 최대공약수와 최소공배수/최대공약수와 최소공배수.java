import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		
		int d = max_divisor(a,b);  //최대 공약수
		
		System.out.println(d);
		System.out.println(a * b / d); //a = ad, b = bd (d를 나눠준다.)
		
	}

	
	public static int max_divisor(int a, int b) { //최대 공약수		
		while (b != 0) {
			int r = a % b; // a/b의 나머지
			
			//GCD(최대공약수) 
			//GCD(a, b) = GCD(b, r)이므로 변환.
			a = b;
			b = r;
			
		}
		return a;
	}
	
	
	
	
	
	
}