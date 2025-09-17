package Chapter04_DS;

// 아이디어: 나머지 값이 같은 두 구간끼리 빼면 나누어 떨어진다.
// 시간복잡도: 1

import java.util.*;
public class P05_B10986_나머지합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] S = new long[N];
        long[] C = new long[M];
        long answer = 0;
        S[0] = sc.nextInt();
        for (int i = 1; i < N; i++) {
            S[i]= S[i-1] + sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            int reminder = (int)S[i] % M;
            if (reminder == 0) answer++;
            C[reminder]++;
        }
        for (int i = 0; i < M; i++) {
            if (C[i] > 1) {
                answer = answer + (C[i] * (C[i] - 1) / 2);
            }
        }
        System.out.println(answer);
    }
}
