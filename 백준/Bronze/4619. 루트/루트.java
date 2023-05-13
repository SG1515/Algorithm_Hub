import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int B = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int num1 = 0;
			int num2 = 0;
			
			if(B == 0 && N == 0) {
				break;
			}
			
			int A = 0;
			while(true) {
				if(Math.pow(A, N) <= B) {
					num1 = A;
				}else if(Math.pow(A, N) > B){
					num2 = A;
					break;
				}				A++;
			}
			int result = (Math.abs(Math.pow(num1, N) - B) <= Math.abs(Math.pow(num2, N) - B)) ? num1 : num2;
			
			System.out.println(result);
		}
	}

}