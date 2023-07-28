package com.example.first.controller;

import com.example.first.student.Student;
import com.example.first.student.StudentRepository;
import com.example.second.service.MyService;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class HolaGradleController {

    private final MyService myService;
    private final StudentRepository studentRepository;


    @GetMapping("/hola")
    public String hola() {
        return myService.message();
    }

    @GetMapping("/friend")
    public String myFriend(Long uid) {
        Student byUid = studentRepository.findByUid(uid);
        return byUid.getUserName();
    }
}
