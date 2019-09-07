package tasks.task1;

import java.util.Date;

public class Engineer implements Employee {
    protected String name;

    public Engineer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date arriveAtWorkplace() {
        return enterOrExitAndLog("Engineer %s has arrived. Time: %tR");
    }

    public Date leaveWorkplace() {
        return enterOrExitAndLog("Engineer %s has left. Time: %tR");
    }

    protected Date enterOrExitAndLog(String message) {
        Date time = new Date();
        System.out.printf(message, name, time);
        return time;
    }

    public void work() {
        System.out.printf("%s is working right now.", name);
    }
}
