import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[] arr;
    static boolean[] visited;
    static int[] result;
    static int num ;

    static StringBuilder sb ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            num = Integer.parseInt(st.nextToken());
            arr = new int[num];
            visited = new boolean[num];
            result = new int[6];

            if (num == 0) break;
            for(int i=0; i<num; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            DFS(0,0);
            System.out.println();
        }
    } // end of main

    public static void DFS(int depth, int start) {
        if(depth == 6) {
            for(int x : result){
                System.out.print(x + " ");
            }
            System.out.println();
            return;
        }

        for(int i=start; i<num; i++) {
            if(!visited[i]){
                visited[i]= true;
                result[depth] = arr[i];
                DFS(depth+1, i);
                visited[i]= false;
            }
        }


    }
}



/*
https://velog.io/@kimmjieun/%EB%B0%B1%EC%A4%80-6603%EB%B2%88-%EB%A1%9C%EB%98%90-Java-%EC%9E%90%EB%B0%94*/
