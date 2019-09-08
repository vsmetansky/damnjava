package tasks.task4.main;

import tasks.task4.sources.Hello;

/**
 * <h3>Class that uses Hello class for printing greetings to current user.</h3>
 * <p>User's name is taken as a first CL argument.</p>
 * <p>If no CL arguments provided - the user's name is not displayed</p>
 *
 * @author vsmet
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        final String template = "Hey %s";
        final String name = args.length == 0 ? "" : args[0];

        Hello greeting = new Hello(template, name);
        greeting.display();
    }
}
