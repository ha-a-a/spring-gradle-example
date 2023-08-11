package com.example.first.student;

import jakarta.persistence.*;
import lombok.Data;


/**
 * @author tangmengyue
 * @Description
 * @createTime 2023年07月26日 18:14:00
 */
@Data
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer uid;
    private String userName;
    private Integer age;
    private Integer classId;
}
