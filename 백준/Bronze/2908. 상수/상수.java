import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
	    br.close();
		int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.println(a > b ? a : b);
	}

}
