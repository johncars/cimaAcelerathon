package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import com.example.demo.repository.IbkdataRepository;
import com.example.demo.entity.Ibkdata;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class TestController{

    @Autowired
    IbkdataRepository ibkdataRespository;
    
    @GetMapping("/test")
    public String test(){
       return "hola";
    }

    @GetMapping("/sql")
    public List<Ibkdata> sql(){
        return ibkdataRespository.findAll();
    }
}