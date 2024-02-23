
import java.util.*;
import java.lang.*;
import java.io.*;

class point { //좌표 
    int x;
    int y;

    point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Main{
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] ch, arr;
    static int n, m;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        ch = new int[n][m]; // 되돌아가지 않도록 check
        
        for(int i=0; i<n; i++ ){
            String s = br.readLine();
            for(int j=0; j<m; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        
        BFS(0,0);
        System.out.println(ch[n-1][m-1]);
    }   //end of main

    public static void BFS(int a, int b) {
        Queue<point> Q = new LinkedList<>();
        Q.offer(new point(a, b));
        ch[a][b] = 1;
        while(!Q.isEmpty()) {
            point p = Q.poll();
            int nowX = p.x;
            int nowY = p.y;
            
            for(int i=0; i<4; i++){
                int px = p.x + dx[i];
                int py = p.y + dy[i];
                if(px < 0 || py < 0 || px >= n || py >= m) continue; // 바깥쪽 바라볼 경우 continue
                if(ch[px][py] >= 1 || arr[px][py] ==0) continue;// ch가 1일 경우 (뒤로가지 않게), 다음 배열이 0이면 continue
                
                Q.offer(new point(px, py)); // 이동하기
                ch[px][py] = ch[nowX][nowY]+1;// ch배열 check
            }  
            
        }

    }
    
}    



