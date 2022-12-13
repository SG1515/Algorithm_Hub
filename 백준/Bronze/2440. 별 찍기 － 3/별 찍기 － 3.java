import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i=1; i <= N; i++) {
			for(int j=i; j <=N; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
	
		br.close();
		bw.flush();
		bw.close();
	}
}
