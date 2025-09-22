package Chapter04_DS;

// 아이디어: 정렬 + 투 포인터
// 시간복잡도: nlog(n)

import java.io.*;
import java.util.*;
public class P08_B1253_좋은수 {
    public static void main(String[] agrs) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int count = 0;
        long[] A = new long[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(A);

        for (int k = 0; k < N; k++) {
            long find = A[k];
            int i = 0;
            int j = N - 1;
            while (i < j) {
                if (A[i] + A[j] == find) {
                    if (i != k && j != k) {
                        count++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (A[i] + A[j] > k) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        System.out.println(count);
        bf.close();
    }
}
