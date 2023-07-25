package com.example.first.controller;

import com.example.second.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangmengyue
 * @Description
 * @createTime 2023年07月24日 17:38:00
 */
@RestController
@RequestMapping("/gradle")
public class HolaGradleController {

    private final MyService myService;

    public HolaGradleController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/hola")
    public String hola() {
        return myService.message();
    }

}
