package Chapter04_DS;

// 아이디어: 결합법칙
// 시간복잡도: N

import java.util.*;

public class P02_B1546_평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        long max = 0;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            if (max < A[i]) max = A[i];
            sum += A[i];
        }
        System.out.println((float)sum / max * 100 / N);
    }
}

