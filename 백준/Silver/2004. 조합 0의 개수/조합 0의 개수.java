import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		
		//5와 2의 승수 구하기
		long count5 = five_s(N) - five_s(N - M) - five_s(M);
		long count2 = two_s(N) - two_s(N - M) - two_s(M);
		
		System.out.println(Math.min(count5, count2));

	}
	
	
	
	// 5의 승수 구하기
	static long five_s(long num) {
		int count = 0;
		
		while (num >= 5) { //5미만은 break
			count += (num / 5);  // 5인자 개수
			num /= 5; // 5의 n승 마다 count + 1
		}
		return count;
	}

	
	
	// 2의 승수 구하기
	static long two_s(long num) {
		int count = 0;
		
		while (num >= 2) { 
			count += (num / 2);  
			num /= 2; 
		}
		return count;
	}
	
	
	
}
