
import java.io.BufferedReader;
import java.util.Queue;
import java.util.LinkedList;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int R, C;
	static char[][] map;
	static Queue<int[]> q = new LinkedList<>();
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		map = new char[R][C];
		
		for(int i=0; i<R; i++) {
			char[] str = br.readLine().toCharArray();
			for(int j=0; j<C; j++) {
				map[i][j] = str[j];
 			}
		}
		
		for(int i=2; i<=N; i++) {
			if(i % 2 == 1) { //홀수이면 
				
				for(int k=0; k<R; k++) {
					for(int j=0; j<C; j++) {
						if(map[k][j] == 'O') 
							q.offer(new int[] {k, j});
					}
				}
				
				for(char[] m : map) {
					Arrays.fill(m, 'O');
				}
				
				
				bfs();
			}
		}
		
		if(N % 2 == 0) { // 짝수일 때 폭탄 다시 설치
			for(int i=0; i<R; i++) {
				for(int j=0; j<C; j++) {
					map[i][j] = 'O';
				}
			}
		}
		
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		
		
	} // end of main
	
	private static void bfs() {
		while (!q.isEmpty()) {
			int[] t = q.poll();
			int x = t[0];
			int y = t[1];
			map[x][y] = '.';
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(range(nx, ny) && map[nx][ny] == 'O') {
					map[nx][ny] = '.';
				}
			}
		}
	}
	
	private static boolean range(int x, int y) {
		return x >= 0 && x < R  && y >= 0 && y < C;
	}

}
