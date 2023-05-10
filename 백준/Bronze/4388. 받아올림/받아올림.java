import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder sb = new StringBuilder(st.nextToken());
			String N = sb.reverse().toString();
			sb = new StringBuilder(st.nextToken());
			String M = sb.reverse().toString();
			
			int Nsize = N.length();
			int Msize = M.length();
			
			if(N.equals("0") && M.equals("0")) {
				break;
			}
			
			int num = 0;
			int count = 0;
			
			for(int i = 0; i < Math.max(Nsize, Msize); i++) {
				int n = 0;
				int m = 0;
				if(i < Math.min(Nsize, Msize)) {
					n = N.charAt(i) - '0';
					m = M.charAt(i) - '0';
				}else {
					n = (Math.max(Nsize, Msize) == Nsize) ? N.charAt(i) - '0' : M.charAt(i) - '0';
				}
				if((n + m  + num) >= 10) {
					num = 1;
					count++;
				}else {
					num = 0;
				}
			}
			System.out.println(count);
		}
	}

}