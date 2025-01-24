package com.ecamp.andes.controller;

import com.ecamp.andes.dto.AuthenticationRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class Public {
    @GetMapping("/home")
    public String home() {
        return "Bienvenido a la API pública";
    }

    @PostMapping("/home")
    public String home(AuthenticationRequest authenticationRequest) {
        System.out.println(authenticationRequest);

        return "login";

    }
}