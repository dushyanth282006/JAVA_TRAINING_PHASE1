package Day5;

public class KokoEatingBanana {

    public static int speedofEating(int[] bunches, int h) {
        int left = 1;
        int right = 0;
        for (int bunch : bunches) {
            right = Math.max(right, bunch);
        }
        int answer = right;
        while (left <= right) {
            //int mid = left + (right - left) / 2;
            int mid = left + (right - left) / 2;
            long totalHours = 0;
            for (int bunch : bunches) {
            totalHours = totalHours + (bunch + mid - 1) / mid;
            //distance/speed
        }
            if (totalHours <= h) {
            answer = mid;
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return answer;
}
}
