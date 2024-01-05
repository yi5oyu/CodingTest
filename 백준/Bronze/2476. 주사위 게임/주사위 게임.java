import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] aa) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		StringTokenizer st;
		List<Integer> intList = new ArrayList<>();
		for (int z = 0; z < len; z++) {
			st = new StringTokenizer(br.readLine());
			int[] intArr = new int[3];
			for (int i = 0; i < 3; i++)
				intArr[i] = Integer.parseInt(st.nextToken());

			if (intArr[0] == intArr[1] && intArr[1] == intArr[2]) {
				intList.add(10000 + intArr[0] * 1000);
			} else if (intArr[0] != intArr[1] && intArr[1] != intArr[2] && intArr[0] != intArr[2]) {
				int max = -1;
				for (int j = 0; j < 3; j++) {
					if (max < intArr[j])
						max = intArr[j];
				}
				intList.add(max * 100);
			} else {
				int same = intArr[0];
				boolean bb = false;
				for (int j = 1; j < 3; j++) {
					if (same == intArr[j])
						bb = true;
				}
				if (bb) {
					intList.add(intArr[0] * 100 + 1000);
				} else
					intList.add(intArr[1] * 100 + 1000);
			}
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Collections.sort(intList);
		bw.write("" + intList.get(intList.size() - 1));
		bw.close();
	}
}