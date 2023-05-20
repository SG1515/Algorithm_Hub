import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Tc = Integer.parseInt(br.readLine());
		
		for(int i=0; i<Tc; i++) {
			int Num = Integer.parseInt(br.readLine());
			
			int totalPlus = 0;
			int totalMinus = 0;
			int sum = 0;
			for (int j=1; j<=Num; j++) {
				
				if (j%2 ==0) {
					totalMinus -= j;
				} else if (j%2 !=0) {
					totalPlus += j;
				}
				sum = totalPlus + totalMinus;
			}
			System.out.printf("#%d %d\n", i+1, sum);
			
		} //end of for(i)
	}

}
