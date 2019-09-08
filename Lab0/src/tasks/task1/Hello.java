package tasks.task1;

public class Hello {
    public static void main(String[] args) {
        String name = args.length == 0 ? "" : args[0];
        System.out.printf("Hello %s", name);
    }
}
