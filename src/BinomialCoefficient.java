// 9
public class BinomialCoefficient {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        System.out.println(binomialCoefficient(n, k)); // Output: 35
    }
    public static int binomialCoefficient(int n, int k) {
        // Initialize C table
        int[][] C = new int[n+1][k+1];

        // Calculate C[i][j] using dynamic programming
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i) {
                    C[i][j] = 1;
                } else {
                    C[i][j] = C[i-1][j-1] + C[i-1][j];
                }
            }
        }

        return C[n][k];
    }
}
/*
@ binomialCoefficient- definition of binomial Coefficient
@ n- length of array
@ return - returning binomial Coefficient of function
 */