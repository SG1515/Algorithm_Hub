import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }
        int max = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                //현재값이 이전 원소들보다 크면
                if(arr[i] > arr[j]) dp[i] = Math.max(dp[i], dp[j]+1);
                // 이전 원소들 중 가장 큰값 +1
            }
            max = Math.max(max, dp[i]);
        }
        System.out.print(max);
        
        
    }//end of main
}



/*
https://propercoding.tistory.com/41
*/