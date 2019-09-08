package tasks.task3;

public class Main {
    public static void main(String[] args) {
        final String template = "Hey %s";
        final String name = args.length == 0 ? "" : args[0];
        HelloDialog greeting = new HelloDialog(template, name);
        greeting.display();
    }
}