package tasks.task2;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class NumsFilter {
    private NumsFilter() {}
    public static int[] filterInts(int[] nums, IntPredicate callback) {
        if (nums != null && callback != null) {
            return Arrays.stream(nums).filter(callback).toArray();
        }
        return null;
    }
}
