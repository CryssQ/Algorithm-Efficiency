package task9;

public class MaxElementsMethod {
    public static int findSixthLargest(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int k = 0; k < 6; k++) {
            int maxIndex = -1;
            max = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }

            if (maxIndex != -1) {
                arr[maxIndex] = -10001;
            }
        }
        return max;
    }
}
