package com.usama.newstudentdal.repo;

import org.springframework.data.repository.CrudRepository;

import com.usama.newstudentdal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
