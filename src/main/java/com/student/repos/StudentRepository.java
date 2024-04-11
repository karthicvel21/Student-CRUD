package com.student.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.model.StudentModel;


@Repository
public interface StudentRepository extends CrudRepository<StudentModel, Long>   {

}
