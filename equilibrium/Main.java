import java.util.*;

public class Main {
    public static int equilibrium(int[] A, int N) {
        int sum1 = 0;
        for (int i = 0; i < N; i++) {
            sum1 += A[i];
        }
        int sum2 = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            sum1 -= A[i];
            if (sum1 == sum2) {
                ans = i;
                break;
            }
            sum2 += A[i];
        }
        if (ans == Integer.MAX_VALUE) {
            ans = -1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 2, 1 };
        int N = A.length;

        int ans = equilibrium(A, N);
        System.out.println(ans);
    }
}
