package tasks.task1;

import java.util.Date;

public class Director extends Engineer {
    public Director(String name) {
        super(name);
    }

    @Override
    public Date arriveAtWorkplace() {
        return enterOrExitAndLog("Director %s has arrived!!! Time: %tR");
    }

    @Override
    public Date leaveWorkplace() {
        return enterOrExitAndLog("Director %s has left!!! Time: %tR");
    }
}
