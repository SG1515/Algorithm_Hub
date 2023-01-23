import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        final int towerHeight = Integer.parseInt(br.readLine());
        System.out.print(BigInteger.valueOf(1).shiftLeft(towerHeight));
    }
}