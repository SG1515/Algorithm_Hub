import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int Tc = Integer.parseInt(br.readLine());
		
		for (int i=0; i<Tc; i++) {
			String str = br.readLine();
			System.out.println(str.substring(0,1).toUpperCase()+str.substring(1));
			
		}
	}

}