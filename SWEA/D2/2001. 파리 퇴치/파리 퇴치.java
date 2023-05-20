import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Tc = Integer.parseInt(br.readLine());
		
		for(int i=0; i<Tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); 
			int M = Integer.parseInt(st.nextToken()); //파리채
			int[][] arrN = new int[N][N]; //NxN 배열 생성
			
			for (int j=0; j<N; j++) { // NN배열에 숫자채우기
				st = new StringTokenizer(br.readLine());
				for(int k=0; k<N; k++) {
					arrN[j][k] = Integer.parseInt(st.nextToken());
				}
				
			}
			
			// MxM 파리채에 최대 값 찾기
			int max = 0; //최대값
			int sum = 0;
			for (int j=0; j<= N-M; j++) {
				for(int k=0; k<= N-M; k++) {
					sum=0;
					for(int a=0; a<M; a++) {
						for(int b=0; b<M; b++) {
							sum += arrN[j+a][k+b];
						}
					}
					max = Math.max(sum, max);
				}
			}
			
			System.out.printf("#%d %d\n", i+1,max);	
		} // end of for(i)
		
	}

}