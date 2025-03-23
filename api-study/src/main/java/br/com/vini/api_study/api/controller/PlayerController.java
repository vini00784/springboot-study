package br.com.vini.api_study.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vini.api_study.api.controller.definition.PlayerControllerDef;

@RestController
@RequestMapping("/v1/player")
public class PlayerController implements PlayerControllerDef {
    
    @GetMapping("/first-message")
    public String firstMessage() {
        return "Funfou";
    }

}
