import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int tmp = 0;
        int result =0;
        int[] ans = new int[n+1];
        
        for(int i=1; i<=n; i++){
            ans[i] += tmp + arr[i];
            
            tmp += arr[i];
        }
        
        for(int x : ans) result += x;
        
        System.out.println(result);
    }//end of main
}

