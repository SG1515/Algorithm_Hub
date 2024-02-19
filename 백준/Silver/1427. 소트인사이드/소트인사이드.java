import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String n = st.nextToken();
        char[] c = n.toCharArray();
        Arrays.sort(c);

        
        String answer = "";
        for(int i=n.length()-1;i>=0; i--){
            answer += "" + c[i];
        }
        System.out.println(answer);
        
    }//end of main
}

