import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N;
    static int[] arr;
    static int count = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        nQueen(0);
        System.out.print(count);


    }// end of main
    public static void nQueen(int depth){
        if(depth == N) { // 모든 열에 검사가 끝나면 count++;
            count++;
            return;
        }

        for(int i=0; i<N; i++) {
            //index(depth)는 열 값(i)은 행
            arr[depth] = i;
            // 현재 열에 놓을 수 있으면 재귀 호출하기.
            if(Possibility(depth)) {
                nQueen(depth+1); //다음 열 검사.
            }
        }
    }
    public static boolean Possibility(int tmp) {

        for(int i=0; i<tmp; i++) {
            //현재와 같은 열,행에 있는지
            if(arr[tmp] == arr[i]){
                return false;
            }

            //열 - 행의 값이 같을 경우 대각선에 놓여있음
            else if( Math.abs(tmp - i) == Math.abs(arr[tmp] - arr[i])){
                return false;
            }
        }
        return true;
    }
}




/*
https://st-lab.tistory.com/118
*/