package task9;

public class TimeFormatter {
    public static String format(long[] times) {
        long sum = 0;

        for (long time : times) {
            sum += time;
        }

        double average = sum / (double) times.length / 1_000_000.0;

        double t1 = times[0] / 1_000_000.0;
        double t2 = times[1] / 1_000_000.0;
        double t3 = times[2] / 1_000_000.0;

        return String.format(
                "%.3f (%.3f %.3f %.3f)",
                average, t1, t2, t3);
    }
}
