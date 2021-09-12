package tech.jitao.ops.bffservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class WebClientEndpoint {

    @Autowired
    private WebClient webClient;

    @GetMapping("/api/web-client")
    public String process() {
        return "pong";
    }
}
