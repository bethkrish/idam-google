package com.vijayforvictory.idam.IDAM.Google.controllers;

// Create an GET API to return hello world message
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Home {
    @GetMapping("/")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/hello")
    public String home(@AuthenticationPrincipal OidcUser principal) {
        String email = principal.getEmail();
        principal.getAttributes().forEach((k, v) -> log.info(k + ":" + v));
        return "Hello " + email;
    }
}
