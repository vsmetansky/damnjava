package tasks.task4.main;

import tasks.task4.sources.Hello;

//**Class that uses Hello class for printing greetings to current user
// user's name is taken as a first CL argument).
// if no CL arguments provided - the user's name is not displayed*/

public class Main {
    public static void main(String[] args) {
        final String template = "Hey %s";
        final String name = args.length == 0 ? "" : args[0];

        Hello greeting = new Hello(template, name);
        greeting.display();
    }
}
