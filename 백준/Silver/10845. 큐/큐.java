import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Queue<Integer> queue = new LinkedList<Integer>();
		int N = Integer.parseInt(br.readLine());

		String lastNum = null;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();

			if (command.equals("pop")) {
				if (queue.isEmpty()) {
					bw.write("-1");
				} else {
					bw.write(String.valueOf(queue.poll()));
				}
				bw.newLine();

			} else if (command.equals("size")) {
				bw.write(String.valueOf(queue.size()));
				bw.newLine();
			} else if (command.equals("empty")) {
				if (queue.isEmpty()) {
					bw.write("1");
				} else {
					bw.write("0");
				}
				bw.newLine();
			} else if (command.equals("front")) {
				if (queue.isEmpty()) {
					bw.write("-1");
				} else {
					bw.write(String.valueOf(queue.peek()));
				}
				bw.newLine();
			} else if (command.equals("back")) {
				if (queue.isEmpty()) {
					bw.write("-1");
				} else {
					bw.write(lastNum);
				}
				bw.newLine();
			} else {
				lastNum = String.valueOf(st.nextToken());
				queue.offer(Integer.parseInt(lastNum));
			}

		}

		bw.flush();
		bw.close();
	}

}