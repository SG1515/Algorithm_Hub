import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		
		
 		while( num >=5 ) { //입력값이 5가 안넘으면 count = 0
			count = count + (num / 5);  //인자의 5의 갯수 파악
			num = num / 5; 
		}
		br.close();
		
		System.out.println(count);

	}

}
