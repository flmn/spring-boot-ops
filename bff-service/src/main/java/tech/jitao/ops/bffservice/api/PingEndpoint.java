package tech.jitao.ops.bffservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingEndpoint {

    @GetMapping("/api/ping")
    public String process() {
        return "pong";
    }
}
