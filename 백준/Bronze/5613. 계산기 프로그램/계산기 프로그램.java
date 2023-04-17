
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = Integer.parseInt(br.readLine());

        while(true) {
            String S = br.readLine();

            if(S.equals("=")) break;

            int N = Integer.parseInt(br.readLine());


            if(S.equals("+")) {
                result += N;
            }else if(S.equals("-")){
                result -= N;
            }else if(S.equals("*")){
                result *= N;
            }else{
                result /= N;
            }
        }
        System.out.println(result);

    }
}