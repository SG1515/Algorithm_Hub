import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = 10;
		int N = 100;
		for(int t=0; t<testCase; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			//입력받기
			int[][] arr = new int[N][N];
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			
			int max = 0;
			for(int i=0; i<N; i++) {
				int rNum = 0;
				int cNum = 0;
				for(int j=0; j<N; j++) {
					rNum += arr[i][j];
					cNum += arr[j][i];
				}
				// 행, 열 중 큰값 일단 뽑자
				max = Math.max(max, Math.max(rNum, cNum));
			}
			
			int crossLR = 0;
			int crossRL = 0;
			//대각선
			for(int i=0; i<N; i++) {
				crossLR += arr[i][i];
				crossRL += arr[i][99-i];
			}
			max = Math.max(max, Math.max(crossLR, crossRL));
			
			System.out.print("#" +  (t+1) + " " + max + "\n");
			
		} // end of test case
		
	}// end of main
}