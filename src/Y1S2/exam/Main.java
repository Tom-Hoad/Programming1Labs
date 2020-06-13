package Y1S2.exam;

import java.util.Arrays;

public class Main {

    public static void main(String []args){
        int[] A = {5, 4, 3, 2, 1, 5, 4, 3, 2, 1};
        A = PROC1(A, 8);
        System.out.println(Arrays.toString(A));
    }

    static int[] PROC1(int[] A, int n) {
        if (n > 0) {
            A = PROC1(A, n - 1);
            int x = A[n];
            int i = n - 1;

            while (i >= 0 && A[i] > x) {
                A[i + 1] = A[i];
                i = i - 1;
            }

            A[i + 1] = x;
        }

        return A;
    }
}
