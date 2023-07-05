import java.io.*;
import java.util.*;

public class Main {
    static char[] gan = {'0', '1', '2', '3', '4', '5', '6', '7', '8','9'};
    static char[] zi = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int a = (N + 56) % 60;
        int g = 0;
        int z = 0;
        for(int i = 0; i < a; i++){
            if(g == 9) g = 0;
            else g++;
            if(z == 11) z = 0;
            else z++;
        }
        bw.write(zi[z]);
        bw.write(gan[g] + "\n");        

        bw.flush();
        br.close();
        bw.close();
    }
}