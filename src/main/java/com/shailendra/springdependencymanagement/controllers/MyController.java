package com.shailendra.springdependencymanagement.controllers;

import com.shailendra.springdependencymanagement.services.DatasourceService;
import com.shailendra.springdependencymanagement.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;
    private final DatasourceService datasourceService;

    public MyController(GreetingService greetingService, DatasourceService datasourceService) {

        this.greetingService = greetingService;
        this.datasourceService = datasourceService;
    }


    public String sayHello(){
        System.out.println("In the controller!!");

        return greetingService.sayGreeting();
    }

    public String getDatasource(){
        return datasourceService.getDatasource();
    }
}
