import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static boolean[] prime;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		prime = new boolean[N + 1]; //끝나는 수 + 1 크기로 M이 0일 수도 있음 
		
		StringBuilder sb = new StringBuilder();
		getPrime();
		
		
		for(int i = M; i <= N; i++) {
			// false = 소수
			if(!prime[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);

	}
	
	
	
	
	public static void getPrime() {
		// true = 소수X , false = 소수
		prime[0] = prime[1] = true;
		
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i] == true) continue;
			for(int j = i * i; j < prime.length; j += i ) {
				prime[j]= true;
			}
		}
 		
		
		
	}
	
	

}