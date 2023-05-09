import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		while (true) {
			int N = Integer.parseInt(br.readLine());
			if (N == 0)
				break;
			String S = (N % n == 0) ? N + " is a multiple of " + n + "." : N + " is NOT a multiple of " + n + ".";

			System.out.println(S);
		}
	}
}