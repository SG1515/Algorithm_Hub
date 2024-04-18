import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine()); // 건초 개수
            int[] arr = new int[N];
            int sum = 0;
            for(int j=0; j<N; j++) {
                arr[j] = Integer.parseInt(br.readLine());
                sum += arr[j];
            }
            int answer =0;
            int avg = sum / N ;

            for(int x : arr){
                answer += Math.abs(avg - x);
            }

            System.out.print("#" + (i+1) + " " + answer/2 + "\n");
        }


    }//end of main

}

