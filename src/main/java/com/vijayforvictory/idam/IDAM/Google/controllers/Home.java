package com.vijayforvictory.idam.IDAM.Google.controllers;

// Create an GET API to return hello world message
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/hello")
    public String home(@AuthenticationPrincipal OidcUser principal) {
        String email = principal.getEmail();
        return "Hello " + email;
    }
}
