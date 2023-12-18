
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder changeC = new StringBuilder();

		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if (Character.isLowerCase(c)) {
				changeC.append(Character.toUpperCase(c));
			} else if(Character.isUpperCase(c)) {
				changeC.append(Character.toLowerCase(c));
			} 
		}
		System.out.println(changeC);
			
		

	} //end of main

}
