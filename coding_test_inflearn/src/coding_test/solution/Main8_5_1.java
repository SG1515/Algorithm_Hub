import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
   
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		String[] stringArr = new String[testCase];

		for(int i=0; i < testCase; i++) {
			stringArr[i] = br.readLine();
		}
		
		for(String x : T.solution(testCase, stringArr)) {
			System.out.println(x);
		}
	}
	
	public ArrayList<String> solution(int testCase, String[] arr) {
		ArrayList<String> result = new ArrayList<>();
		for(String s : arr) {
			StringBuilder sb = new StringBuilder();
			String tmp = sb.append(s).reverse().toString();
			result.add(tmp);
		}
		
		return result;
		
	}
}