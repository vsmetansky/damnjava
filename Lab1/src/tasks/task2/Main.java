package tasks.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;

public class Main {
    private static IntPredicate condition = x -> x % 5 == 0 || x % 10 == 0;

    public static void main(String[] args) {
            int nums[] = NumsReader.consoleReadInts();
            int filteredNums[] = NumsFilter.filterInts(nums, condition);
            printIntArr(filteredNums);
    }

    private static void printIntArr(int[] arr) {
        if (arr != null) System.out.println((Arrays.toString(arr)));
        else System.out.println("Array is null, cannot print it");
    }
}
