import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        while (true) {
            String inputStr = br.readLine();
            if (inputStr.equals("#")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(inputStr, " ");
            char givenLetter = st.nextToken().charAt(0);

            String str = "";

            while (st.hasMoreTokens()) {
                str += st.nextToken();
            }

            System.out.println(givenLetter + " " + countCharInStr(givenLetter, str));
        }
    }

    private static int countCharInStr(char givenLetter, String str) {
        int count = 0;
        for (char letter : str.toLowerCase().toCharArray()) {
            if (letter == givenLetter) {
                count++;
            }
        }
        return count;
    }
}