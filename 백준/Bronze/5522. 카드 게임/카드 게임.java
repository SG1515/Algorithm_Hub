import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (int i = 0; i <= 4; i++) {
			int num = Integer.parseInt(br.readLine());
			sum += num;
		}
		System.out.print(sum);
	}

}
