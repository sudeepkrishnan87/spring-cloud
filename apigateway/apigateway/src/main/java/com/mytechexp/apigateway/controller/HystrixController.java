package com.mytechexp.apigateway.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class HystrixController {

    @GetMapping("/bookfallback")
    @HystrixCommand()
    public String bookServiceFallback()
    {
        return "Book service is dowm please try after some time";
    }
    @GetMapping("/libraryfallback")
    public String libraryServiceFallback()
    {
        return "Library service is dowm please try after some time";
    }
}
