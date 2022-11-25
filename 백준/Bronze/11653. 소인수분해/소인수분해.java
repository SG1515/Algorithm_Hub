import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 2; i * i <= N; i++) { 
			while (N % i ==0) {
				sb.append(i).append('\n');
				N = N / i;
			}
		}
		
		if (N != 1) {
			sb.append(N);
		}
		System.out.println(sb);
		
	}

}
