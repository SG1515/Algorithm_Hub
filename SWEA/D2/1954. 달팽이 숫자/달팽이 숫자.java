import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Solution {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		for(int tc = 1; tc<=T;tc++) {
			int n=Integer.parseInt(br.readLine());
			if (n==1) {
				sb.append("#"+tc+"\n");
				sb.append("1"+"\n");
				continue;
			}
			int x = 0;
			int y = 0;
			int d = 0;
			int[][] dal = new int[n][n];
			for(int i=0;i<n*n;i++) {
				dal[x][y] = i+1;
				x += dx[d];
				y += dy[d];
				int flg = 1;
				if(x<0||x>=n||y<0||y>=n) {
					flg = 0;
				}
				else if(dal[x][y]!=0) {
					flg = 0;
				}
				if(flg == 0) {
					x -= dx[d];
					y -= dy[d];
					d = (d+1)%4;
					x += dx[d];
					y += dy[d];
				}
			}
			sb.append("#"+tc+"\n");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					sb.append(dal[i][j]+" ");
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
			
	}// end of for
		
}// end of main