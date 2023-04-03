import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		String f = "factor\n";
		String m = "multiple\n";
		String n = "neither\n";
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
 
		while(true) {
			
			st = new StringTokenizer(br.readLine()," ");
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
            if(first == 0 && second == 0) break;
			if(second % first == 0) {
				sb.append(f);
			}
			else if(first % second == 0) {
				sb.append(m);
			}
			else {
				sb.append(n);
			}
			
		}
		System.out.println(sb);
	}
 
}