import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        String maxA = "";
        String maxB = "";
        String minA = "";
        String minB = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '5' || a.charAt(i) == '6') {
                minA += "5";
                maxA += "6";
            } else {
                minA += a.charAt(i);
                maxA += a.charAt(i);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '5' || b.charAt(i) == '6') {
                minB += "5";
                maxB += "6";
            } else {
                minB += b.charAt(i);
                maxB += b.charAt(i);
            }
        }
        int min = Integer.parseInt(minA) + Integer.parseInt(minB);
        int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);
        System.out.print(min + " " + max);
    }
}