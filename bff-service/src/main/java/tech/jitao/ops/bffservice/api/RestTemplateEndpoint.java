package tech.jitao.ops.bffservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateEndpoint {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/api/rest-template")
    public String process() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://rest-service:8080/api/ping", String.class);

        return "rest-service: " + responseEntity.getBody();
    }
}
