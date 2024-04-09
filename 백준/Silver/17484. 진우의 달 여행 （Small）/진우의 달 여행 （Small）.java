import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int n, m;
    static int arr[][];
    static int min = Integer.MAX_VALUE;
    static int[] ydir = {-1, 0, 1};
    static int[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 행
        m = Integer.parseInt(st.nextToken()); // 열
        arr = new int[n][m];


        // 배열채우기
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<m; i++){
            visited = new int[n];
            visited[0] = i;
            dfs(1, i, -1); // 시작깊이, 시작y값, 방향
        }


        System.out.println(min);

    }//end of main

    public static void dfs(int depth, int y, int dir){
        if(depth == n) { // 끝까지 왔으면
            int sum = arr[0][visited[0]]; //첫값더하고
            for(int i=1; i<n; i++) {
                sum += arr[i][visited[i]]; // x=깊이 y=현재깊이의 방향
            }

            min = min > sum ? sum : min;
            return;
        }


        // 이전에 이동했던 방향인지도 고려하기
        for(int i=0; i<3; i++){
            int dy = y + ydir[i]; // 왼쪽 가운데 오른쪽
            if(isVaildPosition(dy) && dir != i) {//갈 수 있고 전에 갔던 방향이 아니면
                visited[depth] = dy; //현재깊이의 방문에 방향을 넣고
                dfs(depth +1, dy, i); // 다음 깊이
            }
        }
    }

    public static boolean isVaildPosition(int y){
        if(y < 0 || y >= m){
            return false;
        }
        return true;
    }
}

