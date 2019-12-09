package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TestController{
    
    @GetMapping("/test")
    public String test(){
        return "Primer Aplicativo";
    }
}