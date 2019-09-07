package tasks.task1;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private final Director d = new Director("Vlad");

    @Test
    public void arriveTest() {
        assertEquals(new Date(), d.arriveAtWorkplace());
    }

    @Test
    public void leaveTest() {
        assertEquals(new Date(), d.leaveWorkplace());
    }
}
