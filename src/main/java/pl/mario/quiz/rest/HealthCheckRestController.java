package pl.mario.quiz.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mario.quiz.dto.HealthCheckDto;

@RestController
@RequestMapping("/api")
public class HealthCheckRestController {

    @GetMapping("/health")
    public HealthCheckDto healthCheck(){
        HealthCheckDto dto = new HealthCheckDto(true, "It's working!");
        return dto;
    }

}
