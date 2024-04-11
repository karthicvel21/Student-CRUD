package com.karthicvel.student.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.karthicvel.student.model.StudentModel;

@Repository
public interface StudentRepository extends CrudRepository<StudentModel, Long>   {

}
