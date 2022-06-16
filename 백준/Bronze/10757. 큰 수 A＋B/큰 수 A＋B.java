import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.math.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		
		BigDecimal A = new BigDecimal(str1);
		BigDecimal B = new BigDecimal(str2);
		
		System.out.println(A.add(B).toString());
	}

}
