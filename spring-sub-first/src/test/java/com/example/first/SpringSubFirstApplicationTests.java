package com.example.first;

import com.example.first.student.Student;
import com.example.first.student.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSubFirstApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private  StudentRepository studentRepository;
    @Test
    public void testRepo(){
        Student byUid = studentRepository.findByUid(1);
        System.out.println(byUid);
    }

}
