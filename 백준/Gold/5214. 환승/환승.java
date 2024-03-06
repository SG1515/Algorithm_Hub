import java.io.*;
import java.util.*;

public class Main{
        static ArrayList<ArrayList<Integer>> list;
        static boolean[] visited;
        static int[] dis;
        static int n;
    public static void BFS(int v) {
    	Queue<Integer> Q = new LinkedList<>();
    	visited[v] = true;
    	Q.offer(v);
    	dis[1] = 1;
    	
    	while(!Q.isEmpty()) {
    		int num = Q.poll();
    		for(int to : list.get(num)) {
    			if(visited[to]) continue; // 다음 곳이 방문되어 있으면 skip
    			visited[to] = true; //다음숫자 닫기
    			dis[to] = dis[num]+1; //거리 +1
    			Q.offer(to); // 연관된 node 담기
    					
    		}
    	}
    	
    }

        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 역의 수
        int k = Integer.parseInt(st.nextToken()); // 간선 수
        int m = Integer.parseInt(st.nextToken()); // 하이퍼튜브 개수

        // 하이퍼 튜브도 거쳐서 다음 노드로 
        list = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i <= n+m; i++) {
        	list.add(new ArrayList<Integer>());
        }
        
        visited = new boolean[n+1+m];
        dis = new int[n+1+m];
        
        // 하이퍼튜브 + 역 
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<k; j++) {
            	int tmp = Integer.parseInt(st.nextToken());
            	list.get(tmp).add(n+1+i);
            	list.get(n+1+i).add(tmp);
            }
            
        }

        
        BFS(1);

        if(visited[n]) {
        	System.out.println(dis[n]/2 + 1);
        } else {
        	System.out.println(-1);
        }
    }   
}