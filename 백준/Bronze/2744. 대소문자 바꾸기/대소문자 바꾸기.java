import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String data = br.readLine();
		
		for (int i = 0; i < data.length(); i++) {
			char c = data.charAt(i);
			
			if (Character.isUpperCase(c)) { //대문자이면
				System.out.print(String.valueOf(c).toLowerCase()); //소문자 출력
			} else {
				System.out.print(String.valueOf(c).toUpperCase());
			}
		}

	}

}
