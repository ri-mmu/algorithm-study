package Chapter03_Basic;

import java.io.*;
import java.util.StringTokenizer;

public class Ex03_3_indexHash {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] count = new int[1001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            count[number]++; // 처음 값이 0이니까 count[number] += 1 이랑 같은 뜻
        }
        br.close();
        for (int i = 0; i <= 1000; i++) {
            if (count[i] != 0) {
                for (int j = 0; j < count[i]; j++) {
                    bw.write(i + " ");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
