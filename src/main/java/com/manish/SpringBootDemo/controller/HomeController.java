package com.manish.SpringBootDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HomeController {

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World ok";
    }

    @GetMapping("/pathVariable/{id}")
    String path(@PathVariable String id){
        return "variable : "+id;
    }


    @GetMapping("/requestParam")
    String request(@RequestParam String name){
        return "name : "+name;
    }
}
