package task9;

import java.util.Arrays;

public class SortingMethod {
    public static int findSixthLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 6];
    }
}
