import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double A = Double.parseDouble(st.nextToken());
			double B = Double.parseDouble(st.nextToken());
			double C = Double.parseDouble(st.nextToken());
			double D = Double.parseDouble(st.nextToken());
			double E = Double.parseDouble(st.nextToken());
			
			double result = (A * 350.34) + (B * 230.90) + (C * 190.55) + (D * 125.30) + (E * 180.90);
			
			System.out.println("$" + String.format("%.2f", result));
		}
		
	}

}