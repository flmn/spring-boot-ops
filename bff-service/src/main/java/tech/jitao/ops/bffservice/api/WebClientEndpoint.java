package tech.jitao.ops.bffservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
public class WebClientEndpoint {

    @Value("${backend.rest-service}")
    private String restService;

    @Autowired
    private WebClient webClient;

    @GetMapping("/api/web-client")
    public String process() {
        URI url = UriComponentsBuilder.fromHttpUrl(restService + "/api/ping").build().toUri();

        String body = webClient.get().uri(url).retrieve()
                .bodyToMono(String.class)
                .block();

        return "rest-service: " + body;
    }
}
