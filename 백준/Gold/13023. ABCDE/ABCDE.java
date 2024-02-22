import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] list;
    static int answer =0 ;
    
    static void DFS(int start, int depth){
        if(depth == 5){
            answer = 1;
            return;
        }
        
        visited[start] = true;
        for(int i : list[start]){
            int next = i;
            if(!visited[next]){
                DFS(next, depth+1);
            }
        }
        visited[start] = false;   
        
    }
    
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 사람수                                                                             
        int m = Integer.parseInt(st.nextToken()); // 관계수
        
        list = new ArrayList[n];
        visited = new boolean[n];
        for(int i=0; i<n; i++){
            list[i] = new ArrayList<Integer>();
        }
        
        
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        
        for(int i=0; i<n; i++){
            if(answer == 0)
            DFS(i, 1); //start랑 depth 넘겨주기
        }

        System.out.println(answer);

    } //end of main
}

