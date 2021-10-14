package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
@RequestMapping(value = "/")
public String gethello(){

    return "hello";
}
}
