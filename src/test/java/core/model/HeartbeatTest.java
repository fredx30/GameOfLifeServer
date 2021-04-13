package core.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeartbeatTest {

    @Test
    public void testGetId() {
        Heartbeat heartbeat = new Heartbeat(1,"Hello");
        assertEquals(1,heartbeat.getId());
    }

    @Test
    public void testGetContent() {
        Heartbeat heartbeat = new Heartbeat(1,"Fredrik");
        assertEquals("Fredrik",heartbeat.getContent());
    }
}
