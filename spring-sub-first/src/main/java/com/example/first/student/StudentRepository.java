package com.example.first.student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author tangmengyue
 * @Description
 * @createTime 2023年07月26日 18:14:00
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    Student findByUid(Long uid);
}
