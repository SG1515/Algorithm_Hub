import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 1;
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			
			if(n % 2 == 0) {
				n = (((n * 3) / 2) * 3) / 9;
				System.out.println(count + ". even " + n);
			}else {
				n = ((((n * 3) + 1) / 2) * 3) / 9;
				System.out.println(count + ". odd " + n);
			}
			count++;
		}
	}

}