package com.example.gurucharanq2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.gurucharanq2.service.MyService;

@RestController
public class MyController {

    @Autowired
    public MyService myService;

    public void AppController(){
        myService.AppService();
    }

}
