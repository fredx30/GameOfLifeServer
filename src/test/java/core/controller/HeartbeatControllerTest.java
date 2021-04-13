package core.controller;

import core.model.Heartbeat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import resources.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

public class HeartbeatControllerTest extends AbstractTest {

    @Override
    @BeforeEach
    public void setUp() {
        super.setUp();
    }

    @Test
    public void getHeartbeat() throws Exception {
        String uri = "/heartbeat";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals("{\"id\":1,\"content\":\"Hello, World!\"}", content);
    }

    @Test
    public void getHeartbeatName() throws Exception {
        String uri = "/heartbeat?name=Fredrik";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals("{\"id\":2,\"content\":\"Hello, Fredrik!\"}", content);
    }
}
