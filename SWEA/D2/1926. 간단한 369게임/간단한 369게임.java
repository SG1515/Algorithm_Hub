import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=num; i++) {
			
			int num_1 = i;
			int num_10 = i/10;
			int num_100 = i/100;
				if ( !(num_1 % 10 == 3 || num_1 % 10 == 6 || num_1 % 10 == 9 || num_10 % 10 == 3 || num_10 % 10 == 6 || num_10 % 10 == 9 || num_100 % 10 == 3 || num_100 % 10 == 6 || num_100 % 10 == 9)) {
					System.out.print(i);	
				}
			
				if( num_1 % 10 == 3 || num_1 % 10 == 6 || num_1 % 10 == 9 ){
					System.out.print("-");
				}
				if( num_10 % 10 == 3 || num_10 % 10 == 6 || num_10 % 10 == 9) {
					System.out.print("-");
				}
				 if( num_100 % 10 == 3 || num_100 % 10 == 6 || num_100 % 10 == 9) {
					System.out.print("-");
				}
				System.out.print(" ");
			
				
			
		}
		
		
	}

}