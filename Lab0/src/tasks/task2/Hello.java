package tasks.task2;

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
