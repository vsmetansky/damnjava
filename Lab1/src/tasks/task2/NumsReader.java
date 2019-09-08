package tasks.task2;

import java.util.Scanner;

public class NumsReader {

    private static String delimiter = " ";

    private NumsReader() {
    }

    public static int[] consoleReadInts() {
        final String formatMessage = "You should enter integers delimited with spaces:";
        try (Scanner scan = new Scanner(System.in)) {
            displayMessage(formatMessage);
            String text = scan.nextLine();
            return stringToIntArr(text, delimiter);
        } catch (Exception e) {
            logError(e);
            return null;
        }
    }

    private static int[] stringToIntArr(String text, String delimiter) {
        String[] textSplitted = text.split(delimiter);
        return splittedToIntArr(textSplitted, textSplitted.length);
    }

    private static int[] splittedToIntArr(String[] splitted, int splittedLen) {
        int[] nums = new int[splittedLen];
        for (int i = 0; i < splittedLen; i++) {
            nums[i] = Integer.parseInt(splitted[i]);
        }
        return nums;
    }

    private static void logError(Exception e) {
        System.out.printf("An error occurred (probably input format is wrong): %s", e.getMessage());
    }

    private static void displayMessage(String message) {
        System.out.println(message);
    }
}
