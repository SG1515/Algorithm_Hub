
import java.io.*;
import java.util.*;

public class Main {
	static int R, C;
	static int[][] map;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static Queue<int[]> q = new LinkedList<>();
	static int t[] = new int[2];
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		C = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		map = new int[R][C];
		
		for(int i=0; i<R; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<C; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 1) {
					q.offer(new int[] {i,j});
				}
			}
		}
		

		System.out.println(bfs());
		
	} // end of main 
 	public static int bfs() {
 		while(!q.isEmpty()) {
 			int[] t = q.poll();
 	 		int x = t[0];
 	 		int y = t[1];
 	 		
 	 		for(int i=0; i<4; i++ ) {
 	 			int nx = x + dx[i];
 	 			int ny = y + dy[i];
 	 			
 	 			if(!range(nx, ny)) continue;
 	 			if(map[nx][ny] == 0) {
 	 				map[nx][ny] = map[x][y] +1; //일수 늘리면서 너비 탐색
 	 				q.offer(new int[] {nx, ny});
 	 			}
 	 		}
 		}
 		
 		int max = Integer.MIN_VALUE;
 		//0이 있는지 검사하기
 		if(check()) {
 			return -1;
 		} else {
 			for(int i=0; i<R; i++) {
 				for(int j=0; j<C; j++) {
 					if(map[i][j] > max) {
 						max = map[i][j];
 					}
 				}
 			}
 			return max - 1;
 		}
 		
 		
 		
 	} // end of bfs
 	
 	public static boolean check() {
 		for(int i=0; i<R; i++) {
 			for(int j=0; j<C; j++) {
 				if(map[i][j] == 0) return true; 
 			}
 		}
 		
 		return false;
 	}
	public static boolean range(int x, int y) {
		return x >= 0 && x < R && y >= 0 && y < C;
	}
}
