import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1[] = br.readLine().split(" ");
        int L = Integer.parseInt(str1[0]);
        int K = L * Integer.parseInt(str1[1]);
        String str2[] = br.readLine().split(" ");
        for (int i = 0; i < 5; i++) {
            bw.write((Integer.parseInt(str2[i]) - K) + " ");
        }
        bw.flush();
    }
}