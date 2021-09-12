package tech.jitao.ops.service.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ping {

    @GetMapping("/api/ping")
    public String process() {
        return "pong";
    }
}
