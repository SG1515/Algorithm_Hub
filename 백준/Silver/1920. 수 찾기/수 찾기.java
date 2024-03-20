import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int[] arrM = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        for (int i = 0; i < m; i++) {
            if (binarySearch(arrM[i]) >= 0) System.out.println(1);
            else System.out.println(0);

        }
    } //end of main

    public static int binarySearch(int key) {

        long lo = 0;
        long hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (int) (lo + hi) / 2;

            if (key < arr[mid]) {
                hi = mid - 1;
            } else if (key > arr[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;


    }
}
/*
https://st-lab.tistory.com/261
*/