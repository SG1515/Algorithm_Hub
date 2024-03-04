

import java.io.*;
import java.util.*;

class Main {
	static int[] list;
	static boolean[] visited,done;
	static int n;
	static int count;
	
	public static void DFS(int v) {
		if(done[v] == true) return; // 해당 번호 검사끝 이미 사이클
		
		if(visited[v] == true) { // 학생이 가리키고 있는 학생 방문되어 있으면 count++ (루프)  
			done[v] = true; // 해당 사이클 true
			count++;
		} else {
			visited[v] = true; // 방문처리
		}
		DFS(list[v]); // 계속 탐색
		
		done[v] = true; // 사이클이 아닌 애들 검사처리 true처리
		visited[v] = false; // 방문 초기화 (중요 매 for문마다 new로 초기화하면 시간초과남)
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<T; i++) { //테스트 케이스
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken()); // 학생수
			list = new int[n+1];
			visited = new boolean[n+1];
			done = new boolean[n+1];
			count = 0;
			
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=n; j++) {
				list[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j=1; j<=n; j++) {
				if(!done[j])
				DFS(j);
			}
			System.out.println(n-count);
		}
		
		
	}
}