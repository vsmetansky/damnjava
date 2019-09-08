package tasks.task3;

import javax.swing.*;

public class HelloDialog {
    private String template;
    private String name;

    public HelloDialog(String template, String name) {
        this.template = template == null ? "" : template;
        this.name = name == null ? "" : name;
    }

    public void display() {
        JOptionPane.showMessageDialog(null, String.format(template, name));
        System.exit(0);
    }
}