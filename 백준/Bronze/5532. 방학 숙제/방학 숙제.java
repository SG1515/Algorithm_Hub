import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
 
        int port = (A / C >= B / D) ? A / C : B / D;
 
        if (A % port == 0) {
            System.out.println(L - port);
            return;
        }else {
            System.out.println(L - (port+1));
        }
    }
}