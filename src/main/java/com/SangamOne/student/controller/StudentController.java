package com.SangamOne.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.student.entity.Student;
import com.SangamOne.student.repository.StudentRepo;
import com.SangamOne.student.service.StudentService;

@RestController
@RequestMapping(value="/stu")
public class StudentController {
 
	@Autowired
	StudentService studentService;
	
	@Autowired
	StudentRepo studentRepo;
	
	@PostMapping("/add")
	public Student addValue() {
		Student stu = new Student();
		stu.setStudentName("Prajwal");
		return studentService.addValue(stu);
	}
		
		@GetMapping("/getName/{studentName}")
			public List<Student> findBStudents(@PathVariable("studentName") String studentName){
			return studentRepo.findByStudentName(studentName);
		}
	
}
