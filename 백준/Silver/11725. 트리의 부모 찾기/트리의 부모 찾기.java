import java.util.*;
import java.lang.*;
import java.io.*;


class Main{
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	static int[] result;//부모노드 저장 배열
	
	public static void DFS(int v) {
		visited[v] = true;
		
		for(int next : list[v]) {
			if(!visited[next]) {
				DFS(next);
				result[next] = v;//next 4 v 2
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	list = new ArrayList[n+1];
    	visited = new boolean[n+1];
        result = new int[n+1];

    	for(int i=0; i<n+1; i++) {
    		list[i] = new ArrayList<Integer>();
    	}
    	
    	for(int i=0; i<n-1; i++) {
    		st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		
    		list[a].add(b);
    		list[b].add(a);
    	}
    	
    	DFS(1);
    	for(int i=2; i<result.length; i++) {
    		System.out.println(result[i]);
    	}
    }
    
}    



