import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
        static int n;
        static int[] pn;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 정점 개수
        int m = Integer.parseInt(st.nextToken()); // 간선 개수
        int v = Integer.parseInt(st.nextToken()); // 시작점
        pn = new int[n];
        
        boolean[] visited = new boolean[n+1];
        ArrayList<Integer>[] list = new ArrayList[n+1];
        for(int i=0; i<list.length; i++){
            list[i] = new ArrayList<Integer>();
        }
        
        //인접리스트 생성
        // 무방향 X
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        // 자식이 여러개면 노드 번호가 작은 것 먼저 방문하므로 오른차순 정렬
        for(int i=0;i<list.length; i++){
            Collections.sort(list[i]); //매 배열에 마다 정렬하기
        }
        
        DFS(list, visited, v);
        Arrays.fill(visited, false);
        System.out.println();
        BFS(list, visited, v);
        
    } //end of main


    public static void DFS(ArrayList<Integer>[] list, boolean[] visited, int v){
        if(visited[v] == true) return; // 방문했으면 빠져나가기
            
        visited[v] = true; // 방문 표시 
        System.out.print(v + " "); //현재 방문된 곳 출력
        
        for(int x : list[v]){ // 시작점이랑 연결된 곳 순회하기
            if(!visited[x]) // 연결된 곳이 true가 아니면 
            DFS(list, visited, x);
        }   
    }

    public static void BFS(ArrayList<Integer>[] list, boolean[] visited, int v){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v); //시작점 넣기
        visited[v] = true; // 시작점 방문 표시
        
        while(!Q.isEmpty()) {
            v = Q.poll(); //큐에서 꺼내서 시작점 갱신
            System.out.print(v+" ");

            for(int x : list[v]){ //시작점이랑 연결된 곳 순회하기
                if(!visited[x]){ // 연결된 곳이 true가 아니면
                    Q.offer(x); // 그곳을 큐에 넣기
                    visited[x]=true; // 연결된 곳 true로 바꾸기
                }
            }
        }
    }



    
}

