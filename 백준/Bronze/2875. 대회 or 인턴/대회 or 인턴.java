import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		
		int max = 0;
		for(int i = 0; i <= k; i++) {
			int j = k - i;	
			int nowN = n - j;
			int nowM = m - i;
			if(nowN < 0 || nowM < 0) {
				continue;
			}
			
			if(nowN / 2 >= nowM) {
				max = Math.max(max, nowM);
			}
			else {
				max = Math.max(max, nowN / 2);
			}
		}
		System.out.println(max);
	}
}