 import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        while (st.hasMoreTokens()) {
            if (n == Integer.parseInt(st.nextToken())) count++;
        }
        System.out.print(count);
    }
}