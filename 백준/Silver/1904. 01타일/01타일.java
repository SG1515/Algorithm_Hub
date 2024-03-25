import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main {
    static int[] arr = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        
        // -1 로 초기화
        for(int i=3; i<arr.length; i++) {
            arr[i] = -1;
        }
        System.out.println(Tile(n));
        
    } //end of main
    public static int Tile(int n){

        if(arr[n] == -1){ // 메모이제이션 배열에 값이 없을 경우 재귀호출
            arr[n] = (Tile(n-1) + Tile(n-2)) % 15746 ;
        }
        
        return arr[n];
    }
}

/*
https://st-lab.tistory.com/123
https://st-lab.tistory.com/125
*/