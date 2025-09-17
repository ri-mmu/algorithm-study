package Chapter04_DS;

// 아이디어: 결합법칙
// 시간복잡도: N

import java.io.*;
import java.util.*;

public class P02_B1546_평균2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        long max = 0;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            if (max < A[i]) max = A[i];
            sum += A[i];
        }
        System.out.print((float) sum / max * 100 / N);
    }
}

