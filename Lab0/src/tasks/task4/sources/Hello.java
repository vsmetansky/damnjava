package tasks.task4.sources;

/**
 * <h3>Class that is used for printing greetings to the console.</h3>
 *
 * @author vsmet
 * @version 1.0
 */

public class Hello {
    private String template;
    private String name;

    public Hello(String template, String name) {
        this.template = template == null ? "" : template;
        this.name = name == null ? "" : name;
    }


    /**
     * <p>Method that displays predefined greeting</p>
     *
     * @since 1.0
     */
    public void display() {
        System.out.printf(template, name);
    }
}
