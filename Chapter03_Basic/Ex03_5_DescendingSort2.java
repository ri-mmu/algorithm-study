package Chapter03_Basic;

import java.util.Arrays;

public class Ex03_5_DescendingSort2 {
    public static void main(String[] arg) {
        int[] A = {5, 3, 2, 4, 1};
        negate(A);
        Arrays.sort(A);
        negate(A);
        System.out.println(Arrays.toString(A));
    }

    static void negate(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            temp[i] *= -1;
        }
    }
}
