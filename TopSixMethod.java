package task9;

import java.util.Arrays;

public class TopSixMethod {
    public static int findSixthLargest(int[] arr) {
        int[] top6 = new int[6];
        Arrays.fill(top6, Integer.MIN_VALUE);

        for (int num : arr) {
            if (num > top6[0]) {
                top6[0] = num;
                Arrays.sort(top6);
            }
        }
        return top6[0];
    }
}
