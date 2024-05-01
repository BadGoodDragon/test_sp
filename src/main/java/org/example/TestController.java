package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accountmanagement")
public class TestController {

    @GetMapping("/register")
    private boolean register() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        String username = authentication.getName();
        String password = (String) authentication.getCredentials();

        return false;
    }

    @GetMapping("/generatetoken")
    private String generateToken() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        String username = authentication.getName();
        //String password = "pw"; // работает только если
        // добавлена система проверки авторизации

        return " ";
    }

}

