package com.demo.springbootkafka.controller;

import com.demo.springbootkafka.model.Response;
import com.demo.springbootkafka.model.UserData;
import com.demo.springbootkafka.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SendService sendService;

    private Response response = new Response();

    @PostMapping("/publish")
    public List<UserData> getUserData(@RequestBody List<UserData> userData) {

        for(UserData ud: userData) {
            sendService.send(ud);
        }
        return userData;
    }

}
