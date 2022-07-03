import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int d = maxDivisor(a, b); 
			
			sb.append(a * b / d ).append('\n');
		}
		System.out.println(sb);

	}

	public static int maxDivisor(int a, int b) { // 최대 공약수
		
			while (b != 0) {
				int r = a % b;  // 나머지 구하기
				
				// GCD(a, b) = GCD(b, r) 변환
				a = b;
				b = r;
			}
		return a;
			
	}
	

	
	
	
}