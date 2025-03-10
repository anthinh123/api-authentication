package com.example.apikey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiKeyController {

    @GetMapping("/apikeytest")
    public String test() {
        return "Authentication passed";
    }
}
