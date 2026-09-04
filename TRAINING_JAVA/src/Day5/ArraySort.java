package Day5;

import java.util.Arrays;

public class ArraySort {

    public int arrayPairFinding(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        ArraySort arraySort = new ArraySort();
        int result = arraySort.arrayPairFinding(nums);
        System.out.println(result);
    }
    
}
