import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int prev, cur;
		prev = Integer.parseInt(st.nextToken());
		boolean flag = true;
		while(st.hasMoreTokens()) {
			cur =Integer.parseInt(st.nextToken());
			if(cur < prev) {
				flag = false;
				break;
			}
			prev = cur;
		}
		if(flag)System.out.println("Good");
		else System.out.println("Bad");
	}
}
