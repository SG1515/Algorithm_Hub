import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		
		
		int[][] APT = new int[15][15]; // 층, 호
		
		for (int i=0; i < 15; i++) { 
			APT[i][1] = 1; // i층  1호  1로 다 초기화
			APT[0][i] = i; // 0층  i호 
 		}
		
		
		for (int i=1; i < 15; i++) { //1~14층까지
			
			for(int j=2; j<15; j++) { //2호부터 14호까지
			
				APT[i][j] = APT[i][j-1] + APT[i-1][j];
				//i층의 직전 호(j-1)와         아래층 (i-1)의 합을 채우면 됨 
			}
		}
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(APT[k][n]).append('\n');
		}
		
		
		System.out.println(sb);
		
		
	}

}
