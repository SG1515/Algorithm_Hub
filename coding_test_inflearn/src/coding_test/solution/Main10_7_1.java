import java.util.Scanner;


public class Main {
   
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
		
	}
	
	
	public String solution (String str) {
		String result = "YES";
		
		if (str.isEmpty()) {
			return "문자열을 입력하세요.";
		}
		str = str.toUpperCase();
		String reverse = str.reverse().toString();
		
		if(!str.equals(reverse)) return "NO"; 
		
		return result;
	}

	
}