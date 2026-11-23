package task9;

import java.util.Arrays;

public class Main {
    private static final int RUNS = 3;

    public static void main(String[] args) {

        int[] sizes = {
                10000,
                100000,
                1000000,
                10000000,
                100000000
        };

        System.out.printf(
                "%-15s | %-25s | %-25s | %-25s%n",
                "Size",
                "Method 1 (Sorting)",
                "Method 2 (Array of 6)",
                "Method 3 (Max Elements)");

        System.out.println("-".repeat(100));

        for (int size : sizes) {

            long[] times1 = new long[RUNS];
            long[] times2 = new long[RUNS];
            long[] times3 = new long[RUNS];

            for (int run = 0; run < RUNS; run++) {
                int[] originalArray = ArrayGenerator.generateRandomArray(size);
                int[] arr1 = Arrays.copyOf(
                        originalArray, originalArray.length);

                long start1 = System.nanoTime();
                int result1 = SortingMethod.findSixthLargest(arr1);
                long end1 = System.nanoTime();

                times1[run] = end1 - start1;
                long start2 = System.nanoTime();
                int result2 = TopSixMethod.findSixthLargest(originalArray);
                long end2 = System.nanoTime();

                times2[run] = end2 - start2;
                int[] arr3 = Arrays.copyOf(
                        originalArray, originalArray.length);

                long start3 = System.nanoTime();
                int result3 = MaxElementsMethod.findSixthLargest(arr3);
                long end3 = System.nanoTime();

                times3[run] = end3 - start3;
                if (result1 != result2 || result2 != result3) {
                    throw new IllegalStateException(
                            "Algorithms returned different results!");
                }
            }

            System.out.printf(
                    "%-15d | %-25s | %-25s | %-25s%n",
                    size,
                    TimeFormatter.format(times1),
                    TimeFormatter.format(times2),
                    TimeFormatter.format(times3));
        }
    }
}
