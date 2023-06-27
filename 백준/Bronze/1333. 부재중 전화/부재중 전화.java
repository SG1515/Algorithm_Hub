import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int l=Integer.parseInt(st.nextToken());
		int d=Integer.parseInt(st.nextToken());
		boolean time[]=new boolean[n*l+5*(n-1)];
		for(int i=0;i<n;i++) {
			int s=(l+5)*i;
			for(int j=s;j<s+l;j++) {
				time[j]=true;
			}
		}
		int answer=0;
		while(answer<time.length) {
			if(!time[answer]) break;
			answer+=d;
		}
		System.out.println(answer);
	}
}