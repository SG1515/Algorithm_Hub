import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            int cur = Integer.parseInt(br.readLine());
            if (cur == -1) break;
            sum += cur;
        }
        System.out.println(sum);
    }
}