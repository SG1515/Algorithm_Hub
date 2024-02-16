import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] D = new int[n+1][n+1];
        int[][] A = new int[n+1][n+1];

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++){
                D[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //누적합 배열
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++){
                A[i][j] = A[i][j-1] + A[i-1][j] - A[i-1][j-1] + D[i][j]; 
            }
        }
        
        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int fx = Integer.parseInt(st.nextToken());
            int fy = Integer.parseInt(st.nextToken());
            int lx = Integer.parseInt(st.nextToken());
            int ly = Integer.parseInt(st.nextToken());
            
            int answer = A[lx][ly] - A[lx][fy-1] - A[fx-1][ly] + A[fx-1][fy-1];
            System.out.println(answer);
        }
        
        
    
    }//end of main
}


