import java.io.*;
import java.util.*;
public class Main {
    
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }
        StringBuilder sb =new StringBuilder();
        
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int answer = 0;
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            sb.append(arr[k]-arr[j-1]).append("\n");
            
        }
        System.out.println(sb);
        
    }
}
