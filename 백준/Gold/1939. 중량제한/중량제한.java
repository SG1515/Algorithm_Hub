import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static ArrayList<Node>[] list;
    static int ans;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 섬의 개수
        int m = Integer.parseInt(st.nextToken()); // line수

        list = new ArrayList[n+1];
        int lo = 0;
        int hi = 0;

        for(int i=0; i<n+1; i++){
            list[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            list[a].add(new Node(b,w));
            list[b].add(new Node(a,w));
            hi = Math.max(hi, w); //그래프 최대 중량 구하기
        }
        st = new StringTokenizer(br.readLine());
        int from = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());


        while(lo <= hi) { // 최대 무게 이분탐색 0~max 값 찾으므로 정렬되어있어 가능함
            int mid = (lo+hi)/2;
            ans = -1;
            check = new boolean[n+1];
            DFS(from, to, mid);
            if(ans != -1) { //값이 변경된것이면 이동 가능 -> 중량 올리기
                lo = mid+1;
            }else { // 값이 변경된 것이 아니면 이동불가 -> 중량 줄이기
                hi = mid-1;
            }
        } //1


        System.out.println(hi);
    }

    static void DFS(int pos, int target, int limit ){ //pos 현재위치, target 도착 도시B, limit 무게제한
        if(pos == target) { // 현재위치와 도착위치가 같으면 현재위치를 반환
            ans = pos;
            return;
        }
        check[pos] = true; //현재위치 잠구기
        for(Node next : list[pos]) {
            // pos와 이어져있는 next가 방문이 안되어있고, limit중량보다 가볍거나 같아야 방문가능
            if(!check[next.to] && limit <= next.w) {
                DFS(next.to, target, limit);
            }
        }
    }
}

class Node {
    int to;
    int w;

    public Node(int to, int w){
        this.to = to;
        this.w = w;
    }
}