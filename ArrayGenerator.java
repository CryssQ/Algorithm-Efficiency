package task9;

import java.util.Random;

public class ArrayGenerator {
    private static final Random RANDOM = new Random();

    public static int[] generateRandomArray(int size) {

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = RANDOM.nextInt(20001) - 10000;
        }
        return arr;
    }
}
