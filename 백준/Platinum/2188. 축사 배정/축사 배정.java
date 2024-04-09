import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static ArrayList<Integer>[] list;
    static boolean[] check;
    static int[] d;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 소의 수
        int m = Integer.parseInt(st.nextToken()); // 축사의 수
        list = new ArrayList[n+1];
        for(int i=1; i<=n; i++) {
            list[i] = new ArrayList<>();
        }
        check = new boolean[m+1];
        d = new int[m+1];
        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            for(int j=1; j<=s; j++){
                list[i].add(Integer.parseInt(st.nextToken()));
            }

        }

        int cnt = 0;
        for(int i=1; i<=n; i++) {
            Arrays.fill(check, false);
            if(DFS(i)) cnt++; // 축사에 배정되면 cnt++
        }

        System.out.println(cnt);
    }//end of main
    public static boolean DFS(int v) {
        for(int next : list[v]) {
           if(!check[next]) { // v소가 가려고 하는 축사가 닫혀있지 않으면
               check[next] = true;
               // 비어있거나 점유 노드에 더 들어갈 공간이 잇는 경우
               if(d[next] == 0 || DFS(d[next])) {
                   d[next] = v; // 소 넣기
                   return true;
               }
           }

        }

        return false;
    }
}



/*
https://loosie.tistory.com/643
*/
