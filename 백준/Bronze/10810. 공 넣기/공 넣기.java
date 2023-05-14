import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] N = new int[Integer.parseInt(st.nextToken())]; // N개 바구니 생성
		int M = Integer.parseInt(st.nextToken()); // push ball
		
		for(int case1=0; case1<M; case1++) {
			st = new StringTokenizer(br.readLine());
			
			
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			for(int pushNum = i-1; pushNum < j; pushNum++) { // i~j바구니까지 배열은 0번부터 주의하자
				N[pushNum] = k; // k숫자 바구니에 넣기
			}
		}
		for(int z=0; z<N.length; z++) {
			System.out.print(N[z]+ " "); 
		}
	}

}
