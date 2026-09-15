import java.util.Scanner;


public class Main {
   
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		
//		char a = "A".charAt(0);
//		char b = "z".charAt(0);
//		System.out.println((int)a + " " + (int)b);
	}
	
	
	public String solution(String str) {
		String result = "";
		
		char[] strArr = str.toCharArray();
		int lt = 0; 
		int rt = str.length()-1;

		while(lt<rt) {
			if(!Character.isAlphabetic(strArr[lt])) lt++;
			else if(!Character.isAlphabetic(strArr[rt])) rt--;
			else {
				char tmp = strArr[lt];
				strArr[lt] = strArr[rt];
				strArr[rt] = tmp;
				lt++;
				rt--;
			}
		}
		result = String.valueOf(strArr);
		
		return result;
	}
	
}