import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			int money = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			if(A == B && B == C ) {
				money = 10000 + (A * 1000);
			}else if(A != B && B != C && A != C) {
				money = Math.max(A, Math.max(B, C)) * 100;
			}else {
				if(A == B || A == C) {
					money = 1000 + (A * 100);
				}else {
					money = 1000 + (B * 100);
				}
			}
			if(money > max) {
				max = money;
			}
		}
		System.out.println(max);
	}
}