import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = 10;
        int idx =1;
        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[N];
            for(int j=0; j<arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;
            for(int j=2; j<arr.length-2; j++) { // 왼쪽 +2 오른쪽 -2 00으로 되어있음
                int max = Math.max(arr[j-2],Math.max(arr[j-1],Math.max(arr[j+1], arr[j+2])));
                if (arr[j] > max) { //조망권 확보
                    cnt += arr[j] - max;
                }
            }


            System.out.print("#" + idx + " " + cnt + "\n");
            idx ++;
        }






    }//end of main
}

