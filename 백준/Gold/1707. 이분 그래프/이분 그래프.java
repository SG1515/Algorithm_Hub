
import java.io.*;
import java.util.*;

class Main {
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	static int[] check;
	static boolean IsEven;
	
	
	public static void DFS(int start) {
		visited[start] = true; //방문처리
		
		for(int x : list[start]) {
			if(!visited[x]) { // 다음 노드에 방문하지 않았으면 
				check[x] = (check[start] +1) %2; // 0, 1 뒤집어서 넣기
				DFS(x); // 다음 node
			} else if(check[start] == check[x]){ // 다음 노드랑 뒤집혀있어야하는데 같으면 false
				IsEven = false;
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			list = new ArrayList[n+1];
			visited = new boolean[n+1];
			check = new int[n+1];
			IsEven = true;
			
			for(int j=1; j<=n; j++) {
				list[j] = new ArrayList<Integer>();
			}
			
			for(int j=0; j<l; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				list[a].add(b);
				list[b].add(a);
			}
			for(int j=1; j<n; j++) { 
				if(IsEven) { 
					DFS(j);
				} else {// false이면 루프를 돌 필요없이 탈출
					break;
				}
			}
			
			String answer = IsEven ? "YES" : "NO";
			System.out.println(answer);
		}
		
	}
}