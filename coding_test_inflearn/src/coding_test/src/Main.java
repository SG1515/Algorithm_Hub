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
		String[] strArr = str.split("");
		int lt = 0;
		int rt = str.length()-1;
		
		while (lt<rt) {
			if(strArr[lt].equals(strArr[rt])) result = "YES";
			else {
				return result = "NO";
			}
			lt++;
			rt--;
		}
		
		return result;
	}

	
}