package tasks.task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

public class EngineerTest {
    private final Engineer e = new Engineer("Vlad");

    @Test
    public void arriveTest() {
        assertEquals(new Date(), e.arriveAtWorkplace());
    }

    @Test
    public void leaveTest() {
        assertEquals(new Date(), e.leaveWorkplace());
    }

    @Test
    public void workTest() {
        e.work();
    }
}
