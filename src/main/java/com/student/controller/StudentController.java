package com.student.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.StudentModel;
import com.student.repos.StudentRepository;



@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping
	String getStudents() {
		return "Hi...karthicvel";
	}

	@PostMapping
	StudentModel createStudent(@RequestBody StudentModel student) {
		StudentModel studentModel = new StudentModel();
		studentModel.setName(student.getName());
		studentModel.setEmail(student.getEmail());
		studentModel.setAddress(student.getAddress());
		studentRepository.save(studentModel);
		return studentModel;
	}
	
	
	@PutMapping("/{id}")
	StudentModel updateStudent(@PathVariable int id, @RequestBody StudentModel student) {
		student.setId(id);
		studentRepository.save(student);
		return student;
	}
	
	@DeleteMapping("/{id}")
	String deleteStudent(@PathVariable long id) {
		studentRepository.deleteById(id);
		return "Deleted";
	}

}
