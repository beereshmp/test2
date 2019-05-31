package com.uttara.beeresh.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo1")
public class HomeController {




    @RequestMapping("/hello")
    public String sayHello()
    {

        return "Hello Ubantu..!!";
    }
}
