package com.ColdPitch.domain.controller;

import com.ColdPitch.domain.service.HelloService;
import com.ColdPitch.domain.entity.Hello;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class HelloApiController {
    private final HelloService helloService;

    @GetMapping("/hello")
    public ResponseEntity hello() {
        log.info("%", this.hashCode());
        return ResponseEntity.ok("hello");
    }

    @PostMapping("/hello")
    public ResponseEntity save(Hello hello) {
        Hello save = helloService.save(hello);
        return ResponseEntity.ok(save);
    }

    @PostMapping("/test")
    @ResponseBody
    @CrossOrigin("*")
    public Map test(Map map, HttpServletRequest request) {
        map.put("value", request.getParameter("input"));
        map.put("result", "200");
        return map;
    }
}
