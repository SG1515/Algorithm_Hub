import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String S2 = br.readLine();
		String[] s = S.split(":");
		String[] s2 = S2.split(":");
		int[] N = new int[3];
		for(int i = 0; i < 3; i++) {
			N[i] = Integer.parseInt(s2[i]) - Integer.parseInt(s[i]);
		}
		
		if(S.equals(S2)) {
			System.out.println("24:00:00");
		}else {
			if(N[2] < 0) {
				N[2] += 60;
				N[1]--;
			}
			if(N[1] < 0) {
				N[1] += 60;
				N[0]--;
			}
			if(N[0] < 0) {
				N[0] += 24;
			}
			System.out.format("%02d:%02d:%02d", N[0], N[1], N[2]);
		}
	}

}