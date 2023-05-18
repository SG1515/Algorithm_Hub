import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		//1은 가위, 2는 바위, 3은 보
		if (a == 1 && b == 2) {
			System.out.println("B");
			
		} else if (a == 2 && b == 1) {
			System.out.println("A");
			
		} else if (a == 3 && b == 1) {
			System.out.println("B");
			
		} else if (a == 1 && b == 3) {
			System.out.println("A");
			
		} else if (a == 2 && b == 3) {
			System.out.println("B");
	
		} else if (a == 3 && b == 2) {
			System.out.println("A");
		}
		
	}

}