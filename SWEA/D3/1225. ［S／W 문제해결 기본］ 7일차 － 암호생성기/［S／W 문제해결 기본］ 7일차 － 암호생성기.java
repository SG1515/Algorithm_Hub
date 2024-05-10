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
				// q에서 하나 뽑아서 순차적으로 i를 빼준다.
				for(int i=1; i<6; i++) {
					value = q.poll() - i;
					
					// value값이 0보다 작아지면 0으로 만들고 q에 value 넣어준다
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