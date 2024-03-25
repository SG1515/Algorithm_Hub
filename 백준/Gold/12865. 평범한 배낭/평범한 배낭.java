import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
    static int n,k;
    static int dp[][], w[], v[]; //dp 배열과 무게, 가치배열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); // 물품수
        int k = Integer.parseInt(st.nextToken()); // 최대 무게 K

        dp = new int[n+1][k+1]; // dp[i번째 아이템][가치]
        w = new int[n+1]; // 무게
        v = new int[n+1]; // 가치
    
        for(int i=1; i<=n ; i++) {
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken()); 
            v[i] = Integer.parseInt(st.nextToken()); 
        }

        for(int i=1; i<=n; i++){ //물품수
            for(int j=1; j<=k; j++){ //무게
                dp[i][j] = dp[i-1][j]; // 이전 아이템의 가치 저장
                if(j - w[i]>=0) { // 무게에서 자신의 무게를 뺐을 때 남는 무게가 존재하면
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);
                
                }
            }
        }
        System.out.println(dp[n][k]);
    

    }//end of main
}



/*
4 7

6 13 - 1번 아이템
4 8 - 2번 아이템
3 6 - 3번 아이템
5 12 - 4번 아이템
https://st-lab.tistory.com/141
https://fbtmdwhd33.tistory.com/60
*/