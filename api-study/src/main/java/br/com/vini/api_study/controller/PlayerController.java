package br.com.vini.api_study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/player")
public class PlayerController {
    
    @GetMapping("/first-message")
    public String firstMessage() {
        return "Funfou";
    }

}
