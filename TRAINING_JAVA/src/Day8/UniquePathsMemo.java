package Day8;

public class UniquePathsMemo {

    // Recursive helper with memoization
    public static int uniquePathsHelper(int m, int n, int[][] memo) {
        // Base case: if we’re at the first row or first column → only 1 path
        if (m == 1 || n == 1) {
            return 1;
        }

        // If already computed, return cached value
        if (memo[m][n] != -1) {
            return memo[m][n];
        }

        // Recursive relation: paths from top + paths from left
        memo[m][n] = uniquePathsHelper(m - 1, n, memo) + uniquePathsHelper(m, n - 1, memo);

        return memo[m][n];
    }

    public static int uniquePathsFinding(int m, int n) {
        // Initialize memo table with -1
        int[][] memo = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                memo[i][j] = -1;
            }
        }
        return uniquePathsHelper(m, n, memo);
    }

    public static void main(String[] args) {
        int m = 3, n = 2;
        int result = uniquePathsFinding(m, n);
        System.out.println("Unique paths for grid " + m + "x" + n + " = " + result);
    }
}