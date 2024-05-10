import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = 10;
		for(int T=0; T<testCase; T++) {
			Queue<Integer> q = new LinkedList<>();
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<8; i++) {
				int a = Integer.parseInt(st.nextToken());
				q.offer(a);
			}
			int value = 1;
			while(value!=0) {
				for(int i=1; i<6; i++) {
					value = q.poll() - i;
					
					if(value <= 0) {
						value = 0;
						} 
					q.offer(value);
					if(value == 0) break;
					
				}
								
			}
			
			System.out.print("#" + (T+1) + " ");
			while(!q.isEmpty()) {
				System.out.print(q.poll() + " ");
			}
			System.out.println();
		} // end of test case
	}// end of main
}