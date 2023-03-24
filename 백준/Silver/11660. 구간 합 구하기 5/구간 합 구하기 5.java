import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //배열의 크기
        int M = Integer.parseInt(st.nextToken()); //질의수
        int A[][] = new int[N+1][N+1];

        for(int i=1; i<=N; i++){ // 원본 배열 저장
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++){
             A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int D[][] = new int[N+1][N+1]; // 합 배열
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                D[i][j] = D[i][j-1]+D[i-1][j]-D[i-1][j-1]+A[i][j]; //구간 합
            }
        }

        for(int i=0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            //구간 합 배열로 질의에 답변
            int result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];
            System.out.println(result);
        }
        br.close();
    }
}
