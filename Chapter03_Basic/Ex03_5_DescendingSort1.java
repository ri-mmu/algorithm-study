package Chapter03_Basic;

import java.util.*;

public class Ex03_5_DescendingSort1 {
    public static void main(String[] arg) {
        Integer[] A = {5, 3, 2, 4, 1};
        Arrays.sort(A, Collections.reverseOrder());
        System.out.println(Arrays.toString(A));
    }
}
