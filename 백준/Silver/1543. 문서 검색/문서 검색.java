
import java.io.*;
import java.util.*;
import java.util.*;

class Main {
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String str = "" + br.readLine();
		String s = "" + br .readLine();
		
		 
		
		int strLen = str.length();
		int sLen = s.length();
		
		str = str.replace(s, "");
	
		System.out.println((strLen -  str.length())/sLen);

	}
}