import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        String num = br.readLine();
        long remain = 0;

        for(int i=0; i<num.length(); i++){
            remain=(remain*10+num.charAt(i) - '0') % 20000303;
        }
            System.out.println(remain);
        br.close();
    }

}
