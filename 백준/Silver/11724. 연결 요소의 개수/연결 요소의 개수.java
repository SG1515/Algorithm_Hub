import java.io.*;
import java.util.*;


public class Main {

    static void DFS(int L, int n, boolean[][] adj, boolean[] visit) {
        visit[L] = true;//일단 들어오면 해당 인덱스 true 3이면 visit[3]

        for(int i=1; i<=n; i++){ // 
            if(!visit[i] && adj[i][L]){ // 방문되지 않고 adj가 true면
                DFS(i, n, adj, visit); // 탐색
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Main T = new Main();
        int n = Integer.parseInt(st.nextToken()); // 정점
        int m = Integer.parseInt(st.nextToken()); // 간선
        boolean[][] adj = new boolean[n+1][n+1]; 
        
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()); // 시작점
            int v = Integer.parseInt(st.nextToken()); // 끝점
            adj[u][v] = adj[v][u] = true; // 무방향 그래프의 특성
        }
        boolean[] visit = new boolean[n+1];
        int answer =0;
        for(int i=1; i<=n; i++) { // 각 정점이 visit = false일 때
            if(!visit[i]) {
                DFS(i, n, adj, visit); 
                answer++;
            }
        }
        System.out.println(answer);
        
    }//end of main
}

