package com.ColdPitch.domain.controller;

import com.ColdPitch.domain.Service.HelloService;
import com.ColdPitch.domain.entity.Hello;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class HelloApiController {
    private final HelloService helloService;

    @GetMapping("/hello")
    public ResponseEntity hello() {
        return ResponseEntity.ok("hello");
    }

    @PostMapping("/hello")
    public ResponseEntity save(Hello hello) {
        Hello save = helloService.save(hello);
        return ResponseEntity.ok(save);
    }
}
