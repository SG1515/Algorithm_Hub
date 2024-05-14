import java.util.*;
import java.io.*;

class Solution {
	static int[][] map;	
	static int[] dx = {0, 0, -1};
	static int[] dy = {-1, 1, 0};
	static boolean[][] visited;
	static int N = 100;
	static int answer, arriveX, arriveY;
	static boolean flag;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int tc = 10;
	
		for(int T=0; T<tc; T++) {
			int t = Integer.parseInt(br.readLine());
			map = new int[N][N];
			visited = new boolean[N][N];
			
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					if(map[i][j] == 2) {
						arriveX = i;
						arriveY = j;
					}
				}
			}
			flag = false;
			find(arriveX, arriveY); 
			System.out.println("#" + (T+1) + " " + answer);
			
		}
		
	}// end of main
	
	public static void find(int x, int y) {
		if(flag) return;
		if(x == 0) {
			flag = true;
			answer = y;
		}
		
		for(int i=0; i<3; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(range(nx,ny) && map[nx][ny] == 1 && !visited[nx][ny]) {
				visited[nx][ny] = true;
				find(nx, ny);
				visited[nx][ny] = false;
			}
		}
		
	} // end of find

	public static boolean range(int x, int y) {
		return x>=0 && x<N && y>=0 && y<N;
	}
} 