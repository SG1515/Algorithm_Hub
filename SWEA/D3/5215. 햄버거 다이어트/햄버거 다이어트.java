import java.io.*;
import java.util.*;
public class Solution {
	static int[] taste, cal;
	static int N, L, max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); //테스트케이스

        for (int testCase = 1; testCase <= T; testCase++) {
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());//재료의 수
            L = Integer.parseInt(st.nextToken());//제한 칼로리

            taste = new int[N]; //맛 점수
            cal = new int[N]; //칼로리
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                taste[i] = Integer.parseInt(st.nextToken());
                cal[i] = Integer.parseInt(st.nextToken());
            }//end of input

            max = 0;
            getSubSet(0, 0, 0);

            sb.append("#").append(testCase).append(" ").append(max).append("\n");
        }
        System.out.print(sb);
    }

    private static void getSubSet(int cnt, int calSum, int tasteSum) { //재료 부분집합 구하기
        if (calSum > L) return; //최대 칼로리 초과하면 돌아가기
        if (cnt == N) {
        	// 마지막 재료까지 확인했으면(조합으로 포함했든 안했든) DFS에서 빠져나온다
            // 그 전에 지금까지 조합의 칼로리 합이 최대를 넘지 않았으면, max값을 갱신한다.
        	if(calSum <= L) max = Math.max(max, tasteSum);
            return; 
		}
        
        //해당 재료 선택했을 때
        getSubSet(cnt + 1, calSum + cal[cnt], tasteSum + taste[cnt]);

        //해당 재료 선택하지 않았을 때
        getSubSet(cnt + 1, calSum, tasteSum);
    }
}