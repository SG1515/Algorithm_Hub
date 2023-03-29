import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args)throws IOException{
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] train=new int[10][2];
		int Max=0,tmp=0;
		for(int i=0;i<10;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			train[i][0]=Integer.parseInt( st.nextToken() );
			train[i][1]=Integer.parseInt( st.nextToken() );
		}

		Max=tmp=train[0][1];
		
		for(int i=1;i<10;i++) {
			tmp=(tmp-train[i][0])+train[i][1];
			if(Max<=tmp) {
				Max=tmp;
			}
		}
		
		System.out.println(Max);

	}
}