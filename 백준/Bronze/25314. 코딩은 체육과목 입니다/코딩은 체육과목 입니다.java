import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int Ntype = N / 4;
		
		for(int i=Ntype; i>0; i--) {
			System.out.print("long" + " ");
		}
		
		System.out.println("int");
		
	}

}
