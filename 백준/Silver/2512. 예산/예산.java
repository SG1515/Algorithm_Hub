import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        long hi = 0;
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            hi = Math.max(hi ,arr[i]); 
        }
        int key = Integer.parseInt(br.readLine()); // 총 예산값
        
        long lo = 0;
        while(lo <= hi){
            long mid = (lo + hi) /2;
            
            long budget = 0;
            for(int x : arr) {
                if (x >= mid) budget += mid; //값이 상한가보다 크거나 같은 것은 상한가로 더해줌
                else budget +=x; //값이 상한보다 작은 것은 그대로 더해줌 
            }

            if(budget > key) { //현재 값이 총예산보다 크다면 hi를 내리고 작거나 같다면 lo를 올린다.
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        } 
        System.out.println(lo-1);
        
        
    } //end of main
    
}

/*
https://loosie.tistory.com/552
https://su-vin25.tistory.com/entry/JAVA-%EB%B0%B1%EC%A4%80-2512%EB%B2%88-%EC%98%88%EC%82%B0
*/