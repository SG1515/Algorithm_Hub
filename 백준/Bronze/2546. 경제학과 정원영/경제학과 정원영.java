import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t,i,n,m,s;
		long suma,sumb;
		t = Integer.parseInt(br.readLine());
		while(t-->0) {
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			long[] arra = new long[n];
			suma = sumb = 0;
			st = new StringTokenizer(br.readLine());
			for(i=0;i<n;i++) {
				arra[i] = Integer.parseInt(st.nextToken());
				suma += arra[i];
			}
			st = new StringTokenizer(br.readLine());
			for(i=0;i<m;i++) sumb += Integer.parseInt(st.nextToken());
			s = 0;
			for(i=0;i<n;i++) if(arra[i]*n<suma&&arra[i]*m>sumb) s++;
			sb.append(s+"\n");
		}
		System.out.println(sb);
	}
}