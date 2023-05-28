import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int i, t, n, stock[] = new int[3];
		t = Integer.parseInt(in.readLine());
        
		while(t-->0){
			int max = 0;
			n = Integer.parseInt(in.readLine());
			for(i=0;i<n;i++){
				StringTokenizer abc = new StringTokenizer(in.readLine());
				stock[0] = Integer.parseInt(abc.nextToken()); 
                stock[1] = Integer.parseInt(abc.nextToken());
                stock[2] = Integer.parseInt(abc.nextToken());
				if(stock[0]<0 && stock[1]<0 & stock[2]<0) continue;
				max+=Math.max(Math.max(stock[0], stock[1]), stock[2]);
			}
			out.write(String.valueOf(max));
			out.newLine();
		}
		out.close();
		in.close();
	}
}