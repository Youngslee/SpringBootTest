package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculateController {
    
    @RequestMapping("/add")
    public int add(@RequestParam int a,@RequestParam int b){
        return a+b;
    }
    @RequestMapping("/minus")
    public int minus(@RequestParam int a,@RequestParam int b){
        return a-b;
    }
    @RequestMapping("/divide")
    public double divide(@RequestParam int a,@RequestParam int b){
        return a/b;
    }
    @RequestMapping("/multiply")
    public int multiply(@RequestParam int a,@RequestParam int b){
        return a*b;
    }
 
}