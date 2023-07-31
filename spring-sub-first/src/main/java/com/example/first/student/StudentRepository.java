package com.example.first.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author tangmengyue
 * @Description
 * @createTime 2023年07月26日 18:14:00
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByUid(Integer uid);
}
