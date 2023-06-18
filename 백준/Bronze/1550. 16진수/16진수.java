import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main { 
    
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String y = br.readLine();
        int yChar;
        long sum = 0;
        int tenMultiply;
        
        
        for (int i = 0; i < y.length(); i++) {
            yChar = y.charAt(i)-0;
            tenMultiply=1;
 
            for (int j = y.length()-1; j > i; j--) {
                tenMultiply *= 16;
            }
            
            if(48 < yChar && yChar < 58) {
                sum += (yChar-48) * tenMultiply;
            }
            else if(64 < yChar && yChar < 71) {
                sum += (yChar-55) * tenMultiply;
            }
        }
        
        bw.write(sum+"\n");
        bw.flush();  
        bw.close();
    }
}