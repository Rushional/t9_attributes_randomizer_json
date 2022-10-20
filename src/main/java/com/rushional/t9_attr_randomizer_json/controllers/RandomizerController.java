package com.rushional.t9_attr_randomizer_json.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RandomizerController {
    @GetMapping("/randomizer")
    public String randomizer() {
        return "randomizer";
    }
}
