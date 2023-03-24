import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 갯수
        int M = Integer.parseInt(st.nextToken()); // 문제수
        long[] S = new long[N + 1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i <= N; i++){ //배열에 넣기
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken()); //합 배열 만들기
        }

        for(int q=0; q < M; q++) { //문제 수만큼 루프
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i-1]);
        }
    }
}
