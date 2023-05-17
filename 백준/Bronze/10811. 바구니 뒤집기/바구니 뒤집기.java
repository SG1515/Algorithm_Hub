import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 바구니 
		int M = Integer.parseInt(st.nextToken()); // 역순으로 돌릴 횟수
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) { // 바구니에 번호 채우기
			arr[i] = i+1; 
		}
		
		for(int z=0; z<M; z++) {
			
			st = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(st.nextToken()); 
			int j = Integer.parseInt(st.nextToken());
			
			for(int num=i; num <= j; num++, j--) { // 증감연산 두개사용
				int tmp = arr[num-1];
				arr[num-1] = arr[j-1];
				arr[j-1] = tmp;
			}
			
		}
		
		
		for(int basket : arr) {
			System.out.print(basket + " ");
		}
	}
}
