
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) { //카드
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int key =0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
                key = Integer.parseInt(st.nextToken());
                sb.append(upperBound(key) - lowerBound(key)).append(' ');    
        }
        
        System.out.println(sb);

    } //end of main

    public static int upperBound(int key) {

        int lo = 0;
        int hi = arr.length;

        while(lo < hi) {
            int mid  = (lo+hi) /2;

            if(key < arr[mid]) {
            	hi = mid;
            }else {
            	lo = mid+1;
            }
        }
        

        return lo;
    }
    
    public static int lowerBound(int key) {

        int lo = 0;
        int hi = arr.length;

        while(lo < hi) {
            int mid  = (lo+hi) /2;

            if(key <= arr[mid]) {
            	hi = mid;
            }else{
            	lo = mid+1;
            }
        }
        

        return lo;
    }
}
/*
https://st-lab.tistory.com/267
*/