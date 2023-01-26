import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] arr= {'N','n'};
		String alpha = s.next();
		char a = alpha.charAt(0);
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a)
				cnt++;
		}
		if(cnt==0)
			System.out.println("Naver Whale");
		else
			System.out.println("Naver D2");
	}
}