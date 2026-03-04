package com.example.demo;

import java.util.Map;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class  HelloController {

    @GetMapping("/api/hello")
    public Map<String, Object> hello() {
        return Map.of(
                "message", "Hello dalla API Spring!",
                "ok", true
        );
    }
    @GetMapping("/api/goodmorning")
    public Map<String, Object> goodmorning() {
        return Map.of(
                "message", "GoodMorning dalla API Spring!",
                "ok", true
        );
    } 
    @GetMapping("/api/happyday")
    public Map<String, Object> happyday() {
        return Map.of(
                "message", "ThanK Giorgia !",
                "ok", true
        );
    }
    @GetMapping("api/ciao")
    public Map<String, Object> ciao(){
        return Map.of(
                "message", "prova prova 1 2 3",
                "ok", true
        );
    }
}