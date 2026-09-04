package Day5;

public class LeetCode1011 {
    public static int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int weight : weights) {
            left = Math.max(left , weight);
            right += weight;
        }
        int answer = right;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, mid, days)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }

    private static boolean canShip(int[] weights, int capacity, int days) {
        int requiredDays = 1;
        int currentLoad = 0;

        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                requiredDays++;
                currentLoad = 0;
            }
            currentLoad += weight;
        }

        return requiredDays <= days;
    }
}
