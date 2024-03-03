
import java.io.*;
import java.util.*;

class Node {
	int next; 
	int dist;
	
	public Node(int next, int dist) {
		this.next = next;
		this.dist = dist;
	}
}

public class Main{
	static ArrayList<Node>[] list;
	static boolean visited[];
	
	public static int DFS(int a, int b, int dis) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(new Node(a, dis));
		visited[a] = true;
		int max =0;
		
		while(!Q.isEmpty()) {
			Node node = Q.poll();
			if(node.next == b) { // 노드의 다음값이 end 같으면 max 저장 
				max = node.dist;
				break;
			}
			
			for(Node x : list[node.next]) {
				if(!visited[x.next]) {
					Q.offer(new Node(x.next, x.dist+node.dist));
					visited[x.next] = true;
				}
			}
		}
		return max;
	}
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        list = new ArrayList[n+1];
        
        for(int i=0; i<=n; i++) {
        	list[i] = new ArrayList<>();
        }
        
        for(int i=0; i<n-1; i++) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	int v = Integer.parseInt(st.nextToken());
        	
        	list[a].add(new Node(b, v));
        	list[b].add(new Node(a, v));
        }
        
      
        for(int i=0; i<m; i++) {
        	st = new StringTokenizer(br.readLine());
        	int start = Integer.parseInt(st.nextToken()); 
        	int end = Integer.parseInt(st.nextToken());
        	visited = new boolean[n+1];
        	System.out.print(DFS(start, end, 0)+ " ");
        	
        }
        
        
        
    }   
}