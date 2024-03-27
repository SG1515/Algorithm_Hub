import java.util.*;
import java.lang.*;
import java.io.*;
// 이중루프 현재 벽돌이 올라갈 수 있는지, 벽돌을 올릴수 잇으면 이전 높이에 현재 벽돌 높이 더하기
// 마지막 배열에서 가장 큰 값이 큰 값을 찾으며 해당 column을 역추적해가며 높이가 변결될 대 벽돌을 찾아냄.

class Main {
    static ArrayList<Brick> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        list.add(new Brick(0,0,0,0 )); // 0번벽돌 만들어주기

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); // 넓이
            int h = Integer.parseInt(st.nextToken()); // 높이
            int w = Integer.parseInt(st.nextToken()); // 무게

            list.add(new Brick(i + 1, s, h, w)); // 0번 벽돌 존재
        }

        Collections.sort(list); // 무게 기준으로 정렬

        int[] dp = new int[n+1];

        for(int i=1;i<=n; i++) { // 0에는 빈벽돌이 들어있어서 1부터간다.
            for(int j=0; j<i; j++) { // 현재 벽돌 전까지 비교
                if(list.get(i).size > list.get(j).size) { //이전 사이즈보다 현재가 더 크면 기존높이 + 현재 높이
                    dp[i] = Math.max(dp[i] , dp[j]+list.get(i).height);
                }
            }
        }

        int maxheight = -1;

        for(int i=0; i<=n; i++){ // 제일 높은 높이 저장
            if(maxheight < dp[i]) maxheight = dp[i];
        }

        int index = n;
        ArrayList<Integer> answer = new ArrayList<>();
        while (index != 0){
            if(dp[index] == maxheight) { // 제일 높은 높이와 dp index가 같으면
                answer.add(list.get(index).id); //정답배열에 id넣기
                maxheight -= list.get(index).height;
            }
           index--;
        }

        System.out.println(answer.size()); // 사용된 벽돌 갯수
        for(int i=answer.size()-1; i>=0; i--) {
            System.out.println(answer.get(i));
        }





    }//end of main
}

class Brick implements Comparable<Brick>{
    int id;
    int size;
    int height;
    int weight;

    public Brick(int id, int size, int height, int weight) {
        this.id = id;
        this.size = size;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Brick o){
        return this.weight < o.weight ? -1 : 1;
    }
}

/*
https://lotuslee.tistory.com/131
*/