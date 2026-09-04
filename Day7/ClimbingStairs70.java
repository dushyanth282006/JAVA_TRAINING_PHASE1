package Day7;

public class ClimbingStairs70 {

	public static int climbStairs(int n) {
		if (n <= 2) {
			return n;
		}

		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;

		for (int step = 3; step <= n; step++) {
			dp[step] = dp[step - 1] + dp[step - 2];
		}

		return dp[n];
	}

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("Enter the number of stairs: ");
		int n = scanner.nextInt();

		if (n < 1) {
			System.out.println("Number of stairs must be positive.");
		} else {
			System.out.println("Number of ways: " + climbStairs(n));
		}

		scanner.close();
	}
}