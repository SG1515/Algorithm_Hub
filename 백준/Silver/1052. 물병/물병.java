import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;


public class Main {

    static int n, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        n = input[0];
        k = input[1];
        
        int ans = 0;

        while (Integer.bitCount(n) > k) {
            ans += n & (-n);
            n += n & (-n);
        }
        System.out.println(ans);
    }
}
