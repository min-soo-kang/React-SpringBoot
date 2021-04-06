package com.project.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {
    @GetMapping("/api/hello")
    public Map<String,Object> hello(){
        Map<String,Object> result = new HashMap<>();
        result.put("message","반값습니다. 리액트를 배워봅시다.");

        return result;
    }


}
