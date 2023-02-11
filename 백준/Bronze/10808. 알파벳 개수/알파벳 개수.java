import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int[] n = new int[26];
		for(int i = 0;i<s.length();i++) {
			n[s.charAt(i)-97]++;
		}
		for(int i=0;i<26;i++) {
			System.out.print(n[i]+" ");
		}
	}
}