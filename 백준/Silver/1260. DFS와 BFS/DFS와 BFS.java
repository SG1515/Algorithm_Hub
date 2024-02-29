
import java.io.*;
import java.util.*;
//우왘 지원아 힌트 정답 한개도 안보고 풀었숨ㅋ 굿
public class Main{
    static boolean[] visited;
    static ArrayList<Integer>[] list;
    static int n, m, v;

    public static void DFS(int v){
        visited[v] = true;
        System.out.print(v + " ");
        
        for(int next : list[v]){
            if(!visited[next]){
                DFS(next);
            }
        }
        
    }  // end of dfs
    
    public static void BFS(int v){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v);
        visited[v] = true;
        
        while(!Q.isEmpty()){
            int tmp = Q.poll();
            System.out.print(tmp + " ");
            
            for(int x : list[tmp]){
                if(!visited[x]){
                    Q.offer(x);
                    visited[x] = true;
                }
            }
            
        }
        
    }// end of bfs

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        
        list = new ArrayList[n+1];
        visited = new boolean[n+1];
        
        for(int i=0; i<=n; i++){
            list[i] = new ArrayList<Integer>();
        }
        
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            //양방향
            list[a].add(b);
            list[b].add(a);
        }
        
        //정점번호가 작은 것부터 가게 정리하기
        for(int i=0; i<list.length; i++) {
        	Collections.sort(list[i]);
        }

        DFS(v);
        Arrays.fill(visited, false);
        System.out.println();
        BFS(v);
        
    }   
}