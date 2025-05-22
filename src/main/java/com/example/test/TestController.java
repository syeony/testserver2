package com.example.test;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @PostMapping("/post")
    public ResponseEntity<String> post() {
        return ResponseEntity.ok("Hello World");
    }
}
