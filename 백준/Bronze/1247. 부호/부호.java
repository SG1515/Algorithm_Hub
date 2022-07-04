import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader Object 생성
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int kTestcaseNum = 3;
        // 입력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < kTestcaseNum; i++) {
            final int numSize = Integer.parseInt(br.readLine());
            BigInteger bi = new BigInteger("0");
            for (int j = 0; j < numSize; j++) {
                bi = bi.add(new BigInteger(br.readLine()));
            }
            sb.append(findSign(bi.signum())).append("\n");
        }
        sb.setLength(sb.length() - 1);
        // 출력
        System.out.print(sb);
        // 생성된 BufferedReader 반환
        br.close();
    }

    private static char findSign(int sigNum) {
        char retVal = '0';
        switch (sigNum) {
            case 0: {
                break;
            }
            case -1: {
                retVal = '-';
                break;
            }
            case 1: {
                retVal = '+';
                break;
            }
        }
        return retVal;
    }
}
