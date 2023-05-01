import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int sum=0;
		for(int i=0; i<=num;i++){
			for(int j=num;j>=i;j--){
				sum+=(i+j);
			}
		}
		System.out.println(sum);
	}
}