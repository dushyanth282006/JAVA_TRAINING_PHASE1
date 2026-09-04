package Day6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubcriptionRenewalWindow {

    public static int longestWindow(List<Integer> days,int k) {

      int left = 0;
      int max = 0;

      for (int right = 0; right < days.size(); right++) {
        if(days.get(right) - days.get(left) > k) {
          left++;
        }
        max = Math.max(max, right - left + 1);
      }

      return max;
    }
      
    public static void main(String[]args){
        // int[] days = {1, 3, 5, 7, 9};
        List<Integer> days = new ArrayList<>();
        days=Arrays.asList(1, 3, 5, 7, 9);
        int K = 4;

        System.out.println("Longest renewal window: " + longestWindow(days, K));
    }
    
}