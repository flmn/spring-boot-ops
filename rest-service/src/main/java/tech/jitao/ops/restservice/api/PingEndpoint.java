package tech.jitao.ops.restservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingEndpoint {

    @GetMapping("/api/ping")
    public String process() {
        return "pong";
    }
}
