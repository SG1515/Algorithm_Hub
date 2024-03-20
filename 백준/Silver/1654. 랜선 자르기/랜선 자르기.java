import java.util.*;
import java.lang.*;
import java.io.*;
 


class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long max = Integer.MIN_VALUE;
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            int len = Integer.parseInt(br.readLine());
            arr[i] = len;
            if(max < arr[i]) max = arr[i];
        }
        

        max++; // 0되는 것을 방지
        long min = 0;
        long mid = 0;
        while (min < max){ //upper  bound써보자.
            long count=0;
            mid = (max + min) / 2;
            

            for(int i=0; i<arr.length; i++){
                count += (arr[i]/mid);
            }
            // 최대 개수 n보다 count가 작으면 길이가 큰거니까 길이를 줄이자
            // 그 외는 자르고자하는 길이를 늘려야하니까 최소 길이를 늘리자.
            if (count < k) {
                max = mid;
            }else {
                min = mid+1;
            }
        
        }
        
        //UpperBound로 얻어진 값의 -1dl 최대길이
        System.out.println(min -1 ); 

    }
     
}

/*
https://st-lab.tistory.com/269
*/