import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int total = 0; 
        int score = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int q = Integer.parseInt(st.nextToken());
            if (q == 1) {
                score++; 
                total += score;
            } else {
                score = 0; 
            }
        }
        System.out.print(total);
    }
}