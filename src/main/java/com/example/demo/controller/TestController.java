package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import com.example.demo.repository.IbkdataRepository;
import com.example.demo.entity.Ibkdata;
import com.example.demo.repository.IbkLoanCalendarRepository;
import com.example.demo.entity.IbkLoanCalendar;
import com.example.demo.repository.IbkLoanDebtRepository;
import com.example.demo.entity.IbkLoanDebt;
import com.example.demo.repository.IbkdataCnRepository;
import com.example.demo.entity.IbkDataCn;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class TestController{

    @Autowired
    IbkdataRepository ibkdataRespository;
    
    @GetMapping("/test")
    public String main(){
        List<Ibkdata> list = sql();
        Ibkdata prueba = list.get(1);
       return prueba.getRuc();
    }

    @GetMapping("/sql")
    public List<Ibkdata> sql(){
        return ibkdataRespository.findAll();
    }
}