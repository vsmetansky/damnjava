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
        Date arrivalTime = new Date();
        System.out.println("Engineer " + name + " has arrived. Time: " + arrivalTime );
        return arrivalTime;
    }
    public Date leaveWorkplace() {
        Date leaveTime = new Date();
        System.out.println("Engineer " + name + " has left. Time: " + leaveTime );
        return leaveTime;
    }
    public void work() {
        System.out.println("I'm working right now.");
    }
}
