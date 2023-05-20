import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int ic=0; ic<T; ic++) {
			int N = Integer.parseInt(br.readLine());
			System.out.printf("#%d\n", ic+1);
			
			int[][] arr = new int[N][N];
			
			for(int i=0; i<N; i++) { //x축 0일때부터 시작
				for(int j=0; j<=i; j++) {
					if (i==j) { //대각선 1
						arr[i][j] = 1;
					} else if (j==0) { //j축 1
						arr[i][j] = 1;
					} else {
						arr[i][j] = arr[i-1][j-1] + arr[i-1][j]; //나머지
 					}
				}
			}
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<=i; j++) {
					System.out.printf("%d ", arr[i][j]);
				}
				System.out.println();
			}
			
		}
		
	}
}