import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int d = Integer.parseInt(br.readLine());
			int max = 1;
			
			while(max + (max * max) <= d) {
				max++;
			}
			System.out.println((max - 1));
		}
	}

}