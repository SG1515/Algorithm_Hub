import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 곡 개수
        int s = Integer.parseInt(st.nextToken()); // 시작볼륨
        int m = Integer.parseInt(st.nextToken()); // 맥시멈 볼륨

        arr = new int[m+1]; // m번째 연주에서 볼륨을 n으로 연주할 수 있다.
        for(int i=0; i<=m; i++){
            arr[i] = -1;
        }
        arr[s] = 0; // 0번째 연주 볼륨 5

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){ // 곡 개수 만큼 루프
            int v = Integer.parseInt(st.nextToken());
            ArrayList<Integer> list = new ArrayList<>();

            for(int j=0; j<=m; j++){
                if(arr[j] == i - 1) {// i-1번째에서 가능한 볼륨 찾기
                    int res1 = j + v;
                    int res2 = j - v;

                    if(res1>=0 && res1<=m) //0보다 크거나 맥스 볼륨보다 작거나
                        list.add(res1);
                    if(res2>=0 && res2<=m)
                        list.add(res2);
                }

            }

            for(int x : list){
                arr[x] = i; // i(m)번째 연주에 볼륨 값들로 넣어주기
            }
        }
        int max = -1;
        for(int i=0; i<=m; i++){
            if(arr[i] == n) // 마지막 곡의 최대 볼륨 -> n 곡의 볼륨들
                max = Math.max(max, i);
        }
        System.out.println(max);

    }//end of main
}



/*
https://lotuslee.tistory.com/131*/