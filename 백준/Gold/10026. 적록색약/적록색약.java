
import java.io.*;
import java.util.*;


class Main {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static char[][] list;
	static boolean[][] visited;
	static int count, n, countB;
	public static void DFS (int x, int y) {
		visited[x][y] =true;
		char tmp = list[x][y]; // 현재 색 넣기
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			// 4방향 탐색이 바깥이거나 n의 범위를 넘으면 continue 
			if(nx < 0 || ny < 0|| nx > n || ny> n) continue;
			// 방문 안하고, tmp와 같은 컬러이면 탐색
			if(!visited[nx][ny] && list[nx][ny] == tmp) {
				DFS(nx, ny);
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		list = new char[n+1][n+1];
		visited = new boolean[n+1][n+1];
		
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<n; j++) {
				list[i][j] = s.charAt(j);
			}
		}
		
		int count =0;
		
		//색약 아닌 사람 
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visited[i][j]) {
					DFS(i,j); // 매 좌표가 출발지가 될 수 있음.
					count++;
				}
			}
		}
		
		int countB =0;
		// 색약인 사람을 위해 R로 통일 
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				visited[i][j] = false;
				if(list[i][j] == 'G') {
					list[i][j] = 'R';
				}
			}
		}
	
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visited[i][j]) {
					DFS(i,j);
					countB++;
				}
			}
		}
		
		System.out.print(count+ " " + countB);
		
	}
}