import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String args[]) throws IOException{ 
		int A = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		bw.write(sb.append(printNum(A)).toString());
		bw.close();
	}
	

	static int printNum(int num) {
		if(num%2!=1) { 		
			num = num/2;
			num = num+1;
			num*=num;
			return num;
			
		}else { 			
			
			int row = ((num-1)/2)+1;
			int col = ((num+1)/2)+1;
			
			return row*col;
		}
	}
}