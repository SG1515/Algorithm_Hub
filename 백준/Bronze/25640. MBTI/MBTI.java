import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String st= scan.nextLine();
		int N=Integer.parseInt(scan.nextLine());
		int tmp=0;
		for(int i=0;i<N;i++) {
			String temp=scan.nextLine();
			if(temp.equals(st)) 
                tmp++;
		}
		System.out.println(tmp);
	}
}