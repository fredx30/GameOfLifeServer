package core.controller;

import java.util.concurrent.atomic.AtomicLong;

import core.model.Heartbeat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartbeatController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/heartbeat")
    public Heartbeat heartbeat(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Heartbeat(counter.incrementAndGet(), String.format(template, name));
    }

}
