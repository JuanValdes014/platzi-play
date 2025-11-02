package com.platzi_play.web.controller;

import com.platzi_play.domain.service.PlatziPlayAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    private final PlatziPlayAiService aiService;
    private final String platform;

    public HelloController(PlatziPlayAiService aiService, @Value("${spring.application.name}") String platform) {
        this.aiService = aiService;
        this.platform = platform;
    }

    @GetMapping("/hello")
    public String Hello() {
        return this.aiService.generateGreeting(platform);
    }
}
