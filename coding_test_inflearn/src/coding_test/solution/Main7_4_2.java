import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
   
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		ArrayList<String> arr = new ArrayList<>();

		for(int i=0; i < testCase; i++) {
			arr.add(br.readLine());
		}
		
		T.solution(arr);
	}
	
	public void solution(ArrayList<String> arr) {
		ArrayList<String> result = new ArrayList<String>();
		
		for(String s : arr) {
			StringBuilder sb = new StringBuilder();
			for (int i=s.length()-1; i>=0; i--) {
				sb.append(s.charAt(i));
			}
			System.out.println(sb.toString());
		}
		
	}
}