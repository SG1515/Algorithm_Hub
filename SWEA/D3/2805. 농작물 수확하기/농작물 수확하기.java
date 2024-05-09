import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int t=0; t<testCase; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			
			// N은 항상 홀수
			int[][] arr = new int[N][N];
			
			for(int i=0; i<N; i++) {
				String s = br.readLine();
				for(int j=0; j<N; j++) {
					arr[i][j] = s.charAt(j)-'0';
				}
			}
		
			int left = N/2;
			int right = N/2;
			int answer = 0;
			for(int i=0; i<N; i++) {
				if (i < N/2) {
					for(int j=left; j<=right; j++) {
						answer += arr[i][j];
					}
					left--;
					right++;
					
				} else { // 중간부터 left와 right를 작게 
					for(int j=left; j<=right; j++) {
						answer += arr[i][j];
					}
					left++;
					right--;
				}
			}
			
			System.out.println("#" + (t+1) + " " + answer);
		} // end of test case
		
	}// end of main
}