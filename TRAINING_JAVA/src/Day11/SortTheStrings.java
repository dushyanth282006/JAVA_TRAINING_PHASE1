package Day11;

import java.util.Arrays;
import java.util.Scanner;
public class SortTheStrings {
    public static String sortCharacter(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);    }
}
}
