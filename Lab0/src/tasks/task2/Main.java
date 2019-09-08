package tasks.task2;

public class Main {
    public static void main(String[] args) {
        final String template = "Hey %s";
        final String name = args.length == 0 ? "" : args[0];

        Hello greeting = new Hello(template, name);
        greeting.display();
    }
}
