import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int sum = 0;
        int tmp = 0;
        int i;
        for(i=0; i<5; i++) {
            tmp = Integer.parseInt(br.readLine());
            if(tmp < 40) tmp = 40;
            sum += tmp;
        }
        bw.write(sum/5 + "");
        
        bw.flush();
        br.close();
        bw.close();
    }
}