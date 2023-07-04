import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static String str;
	static int len;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		char pre = str.charAt(0);
		len = 10;
		for (int i = 1; i < str.length(); i++) {
			if(pre != str.charAt(i)) {
				len += 10;
				pre = str.charAt(i);
			}else {
				len += 5;
				pre = str.charAt(i);
			}
		}
		System.out.println(len);
	}

}