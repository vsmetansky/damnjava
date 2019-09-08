package tasks.task4.sources;

//**Class that is used for printing greetings to the console. */

public class Hello {
    private String template;
    private String name;
    public Hello(String template, String name) {
        this.template = template == null ? "" : template;
        this.name = name == null ? "" : name;
    }
    public void display() {
        System.out.printf(template, name);
    }
}
