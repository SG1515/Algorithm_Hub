import java.util.Scanner;


public class Main {
   
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.println(T.solution(str));
	}
	
	public String solution(String str) {
		String result = "";
		
		
		for(int i=0; i<str.length(); i++) {
			/** 
			 * indexOf 와 i의 값이 같으면 처음 등장한 문자
			 */
			//System.out.println(str.charAt(i) + " " + i + " " +  str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i)) == i)  result += str.charAt(i);
		}
		
		return result;
	}
	
}