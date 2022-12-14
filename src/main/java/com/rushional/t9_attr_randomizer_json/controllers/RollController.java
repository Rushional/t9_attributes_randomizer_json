package com.rushional.t9_attr_randomizer_json.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rushional.t9_attr_randomizer_json.models.StatRollsSet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RollController {
    @GetMapping("/roll")
    public String showJson() {
        StatRollsSet rollsSet = new StatRollsSet();
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(rollsSet);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "everything failed and I didn't bother to make the exception handling better";
    }
}
